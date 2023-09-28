import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    public static String cargarArchivo(String rutaArchivo) {
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return texto;
    }

    public static void guardarArchivo(String rutaArchivo, String texto) {
        try {
            FileWriter fileWriter = new FileWriter(rutaArchivo);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(texto);
            buffer.close();
        } catch (Exception e) {
            System.out.println("Hubo un problema al guardar el archivo");
        }
    }
}
