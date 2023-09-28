import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Que quieres hacer?");
        System.out.println("1) Encriptar");
        System.out.println("2) Desencriptar");
        // Tomar el mensaje del usuario

        Scanner teclado = new Scanner(System.in);
        String opcionElegida = teclado.nextLine();
        System.out.println("Ingrese la ruta del archivo:");
        String rutaArchivo = teclado.nextLine();

        Encriptador encriptador = new Encriptador();
        encriptador.setClave(13);

        // ENCRIPTAR
        if ("1".equals(opcionElegida)) {
            String texto = FileUtil.cargarArchivo(rutaArchivo);
            String textoEncriptado = encriptador.encriptar(texto);
            System.out.println("Texto encriptado: " + textoEncriptado);
            FileUtil.guardarArchivo(rutaArchivo, textoEncriptado);
        } else {
            String texto = FileUtil.cargarArchivo(rutaArchivo);
            String textoDesencriptado = encriptador.desencriptar(texto);
            System.out.println("Texto desencriptado: " + textoDesencriptado);
            FileUtil.guardarArchivo(rutaArchivo, textoDesencriptado);
        }

        System.out.println("Proceso completado con exito!");
    }
}
