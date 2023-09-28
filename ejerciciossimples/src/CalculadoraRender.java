import java.util.Scanner;

public class CalculadoraRender {
    public static void main(String[] args) {
        System.out.println("Indique la cantidad de minutos a grabar:");
        Scanner teclado = new Scanner(System.in);
        double cantMinutos = teclado.nextDouble();
        double precioPorMinuto = 0.05f;
        double precioFinal = precioPorMinuto * cantMinutos;
        System.out.println("Precio final: $" + precioFinal);
    }
}
