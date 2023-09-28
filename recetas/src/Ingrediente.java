public class Ingrediente {
    private String nombre;
    private int cantidad;
    private UnidadMedida unidadDeMedidad;
    private boolean esOpcional;

    public Ingrediente(String nombre, int cantidad, UnidadMedida unidadDeMedidad, boolean esOpcional) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedidad = unidadDeMedidad;
        this.esOpcional = esOpcional;
    }

    public Ingrediente(String nombre, int cantidad, UnidadMedida unidadDeMedidad) {
        this(nombre, cantidad, unidadDeMedidad, false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadMedida getUnidadDeMedidad() {
        return unidadDeMedidad;
    }

    public void setUnidadDeMedidad(UnidadMedida unidadDeMedidad) {
        this.unidadDeMedidad = unidadDeMedidad;
    }

    public boolean getEsOpcional() {
        return esOpcional;
    }

    public void setEsOpcional(boolean esOpcional) {
        this.esOpcional = esOpcional;
    }

    public String toString() {
        if (unidadDeMedidad != null) {
            return cantidad + " " + unidadDeMedidad.toString().toLowerCase()
                    + " de " + nombre;
        } else {
            return cantidad + " " + nombre;
        }
    }
}
