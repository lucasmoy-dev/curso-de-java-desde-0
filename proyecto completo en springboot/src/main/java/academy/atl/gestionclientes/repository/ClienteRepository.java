package academy.atl.gestionclientes.repository;

import academy.atl.gestionclientes.dto.ClienteSearchCriteria;
import academy.atl.gestionclientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("FROM Cliente c WHERE " +
            "c.nombre LIKE CONCAT('%', :nombreCompleto, '%') " +
            "OR c.email LIKE CONCAT('%', :email, '%') " +
            "OR c.telefono LIKE CONCAT('%', :telefono, '%')")
    List<Cliente> buscarClientes(@Param("nombreCompleto") String nombreCompleto,
                                 @Param("email") String email,
                                 @Param("telefono") String telefono);
}
