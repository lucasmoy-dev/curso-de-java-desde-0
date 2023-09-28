import java.util.Scanner;

public class WhileEjercicio1 {
    public static void main(String[] args) {

        int opcionEscogida = 1;
        do {

            System.out.println("Elija la opcion que quiera:");
            System.out.println("1) Contactar con soporte técnico");
            System.out.println("2) Contactar con compras");
            System.out.println("3) Contactar con marketing");
            System.out.println("4) Contactar con prensa");
            System.out.println("5) Consultar saldo");
            System.out.println("0) Salir");

            Scanner teclado = new Scanner(System.in);
            opcionEscogida = teclado.nextInt();
            if (opcionEscogida == 1) {
                System.out.println("Llamando a soporte técnico...");
            }
            if (opcionEscogida == 2) {
                System.out.println("Llamando a compras...");
            }
            if (opcionEscogida == 3) {
                System.out.println("Llamando a marketing...");
            }
            if (opcionEscogida == 4) {
                System.out.println("Llamando a prensa...");
            }
            if (opcionEscogida == 5) {
                System.out.println("Su saldo es de: $X");
            }

        } while(opcionEscogida != 0);


    }
}

