
public class Main {

    public static void main(String[] args) {
        mostrarMensaje();
        mostrarMensaje("Ejemplo");
        mostrarMensaje(true);
    }

    public static void mostrarMensaje() {
        System.out.println("Mensaje de ejemplo");
    }

    public static Boolean mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
        return true;
    }

    public static Boolean mostrarMensaje(Boolean esUnMensaje) {
        System.out.println("Entra por el booleano");
        return true;
    }

}