public class Funciones {
    public static void main(String[] args) {

        String correo1 = "lucasmoy@mail.com";
        String correo2 = "lucasmoy@mailcom";
        String correo3 = "lucasmoymail.com";

        boolean esValido1 = validarCorreo(correo1);
        boolean esValido2 = validarCorreo(correo2);
        boolean esValido3 = validarCorreo(correo3);

        if (esValido1 && esValido2 && esValido3) {
            System.out.println("Todos los correos son validos");
        } else {
            System.out.println("No todos los correos son validos");
        }


    }

    private static boolean validarCorreo(String correo) {
        boolean tieneArroba = correo.contains("@");
        boolean tienePunto = correo.contains(".");
        return tieneArroba && tienePunto;
    }
}