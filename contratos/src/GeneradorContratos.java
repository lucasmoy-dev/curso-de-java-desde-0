import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class GeneradorContratos {

    public void crearContrato(String contratoFileName) {
        String contrato = cargarContrato(contratoFileName);

        contrato = reemplazarDatos(contrato, "[COMPANY_NAME]", "Ingrese el nombre de la empresa:");
        contrato = reemplazarDatos(contrato, "[EMPLOYEE_NAME]", "Ingrese el nombre del empleado:");
        contrato = reemplazarDatos(contrato, "[CITY]", "Ingrese el nombre de la ciudad:");
        contrato = reemplazarDatos(contrato, "[COUNTRY]", "Ingrese el nombre del pais:");
        contrato = reemplazarDatos(contrato, "[CURRENT_DATE]", "Ingrese la fecha:");
        System.out.println(contrato);
        guardarContrato(contrato);
    }

    private void guardarContrato(String contrato) {

            Path ruta = Paths.get("contrato_procesado.txt");
        try {
            Files.write(ruta, contrato.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private String reemplazarDatos(String contrato, String etiqueta, String pregunta) {
        System.out.println(pregunta);
        Scanner teclado = new Scanner(System.in);
        String nombreEmpresa = teclado.nextLine();
        return contrato.replace(etiqueta, nombreEmpresa);
    }

    public String cargarContrato(String fileName) {
        String content = "";
        try {
            Path ruta = Paths.get(fileName);
            List<String> lineas = Files.readAllLines(ruta);
            for (String linea : lineas) {
                content += linea + "\n";
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return content;
    }
}
