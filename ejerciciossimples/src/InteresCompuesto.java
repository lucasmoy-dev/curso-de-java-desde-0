import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el capital inicial:");
        float capitalInicial = teclado.nextFloat();

        System.out.println("Ingrese la adicion anual:");
        float adicionAnual = teclado.nextFloat();

        System.out.println("Ingrese el porcentaje de interes:");
        float tasaInteresAnual = teclado.nextFloat() / 100f;

        System.out.println("Ingrese la cantidad de años:");
        int periodoAnos = teclado.nextInt();

        float montoFinal = capitalInicial;
        for (int i = 0; i < periodoAnos; i++) {
            float crecimientoAnual = montoFinal * tasaInteresAnual;
            montoFinal += crecimientoAnual;
            montoFinal += adicionAnual;
        }

        System.out.println(montoFinal);
    }
}
