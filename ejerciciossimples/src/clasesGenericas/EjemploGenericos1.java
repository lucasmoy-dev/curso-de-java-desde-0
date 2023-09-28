import clasesGenericas.JsonContainer;

public class EjemploGenericos1 {

    public static void main(String[] args) {

        Persona persona = new Persona("Lucas", "moy", "345345", "lucasmoy@gmail.com");
        JsonContainer<Persona> container = new JsonContainer<>(persona);
        System.out.println( container.getJson());
        container.getObjeto().setNombre("Pepe");
        System.out.println( container.getJson());
    }
}