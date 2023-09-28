import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad:");
        Scanner teclado = new Scanner(System.in);
        int loQueEscribioElUsuario = teclado.nextInt();
        int edad = loQueEscribioElUsuario;

        if (edad >= 18) {
            System.out.println("Puede acceder al sitio");
        } else {
            System.out.println("No puede acceder al sitio");
        }
    }
}
