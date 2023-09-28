import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {
        Optional<Persona> cliente = getCliente(10);

        if (cliente.isPresent()) {
            System.out.println(cliente.get().getNombre());
        }
    }

    public static Optional<Persona> getCliente(int id) {
        Persona cliente = new Persona("Lucas", "moy", "234234", "asdasas@asd.com");
        return Optional.of(cliente);
    }
}