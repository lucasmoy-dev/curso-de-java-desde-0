
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String nombre, String apellido,
                   String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        System.out.println();

        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final class Builder {
        private String nombre;
        private String apellido;
        private String telefono;
        private String email;

        private Builder() {
        }

        public static Builder aPersona() {
            return new Builder();
        }

        public Builder withNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder withApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Builder withTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Persona build() {
            return new Persona(nombre, apellido, telefono, email);
        }
    }
}
