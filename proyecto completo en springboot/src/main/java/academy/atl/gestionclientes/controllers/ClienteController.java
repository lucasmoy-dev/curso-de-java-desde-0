package academy.atl.gestionclientes.controllers;

import academy.atl.gestionclientes.dto.ClienteSearchCriteria;
import academy.atl.gestionclientes.models.Cliente;
import academy.atl.gestionclientes.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    IClienteService service;

    @GetMapping("api/cliente/{id}")
    public Cliente getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("api/cliente/{id}")
    public void removeById(@PathVariable("id") Integer id) {
        service.removeById(id);
    }

    @PostMapping("api/cliente")
    public void create(@RequestBody Cliente cliente) {
        service.save(cliente);
    }

    @PutMapping("api/cliente/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
        service.save(cliente);
    }



    @PostMapping("api/cliente/buscar")
    public List<Cliente> buscar(@RequestBody ClienteSearchCriteria searchCriteria) {
        return service.buscar(searchCriteria);
    }
}
