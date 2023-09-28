import java.util.Scanner;

public class Regla50_30_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el salario:");
        float salario = teclado.nextFloat();
        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;

        System.out.println("Deberias asignar tu salario en las siguientes cosas:");
        System.out.println("Necesidades: $" + necesidades);
        System.out.println("Otras cosas: $" + otrasCosas);
        System.out.println("Ahorros: $" + ahorros);

    }
}
