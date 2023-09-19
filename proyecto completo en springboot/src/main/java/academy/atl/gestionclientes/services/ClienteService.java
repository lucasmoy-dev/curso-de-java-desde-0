package academy.atl.gestionclientes.services;

import academy.atl.gestionclientes.dto.ClienteSearchCriteria;
import academy.atl.gestionclientes.models.Cliente;
import academy.atl.gestionclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IEmailService emailService;
    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente getById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void removeById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
        String asunto = "Su cuenta se creo correctamente";
        List<String> to = new ArrayList<>();
        to.add(cliente.getEmail());

        emailService.enviarEmailDeBienvenida(asunto, to, cliente.getNombre());
    }

    @Override
    public List<Cliente> buscar(ClienteSearchCriteria searchCriteria) {
        System.out.println("Nombre: " + searchCriteria.getNombreCompleto());
        return repository.buscarClientes(searchCriteria.getNombreCompleto(), searchCriteria.getEmail(), searchCriteria.getTelefono());
    }

}
