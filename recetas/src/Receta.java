import java.util.List;

public class Receta {
    private String nombre;
    private List<String> pasos;
    private List<Ingrediente> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void setPasos(List<String> pasos) {
        this.pasos = pasos;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void mostrarIngredientes() {
        System.out.println("Ingredientes necesarios:");
        for (Ingrediente ingrediente:ingredientes) {
            System.out.println("- " + ingrediente.toString());
        }
    }

    public void mostrarPasos() {
        System.out.println("Pasos:");
        for (String paso : pasos) {
            System.out.println("- " + paso);
        }
    }
}
