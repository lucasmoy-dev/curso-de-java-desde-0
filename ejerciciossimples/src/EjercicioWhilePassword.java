import java.util.Scanner;

public class EjercicioWhilePassword {
    public static void main(String[] args) {

        int intentos = 3;
        while (intentos > 0) {
            String password = "chocolate";
            System.out.println("Ingrese el password:");
            Scanner teclado = new Scanner(System.in);
            String userPassword = teclado.nextLine();

            if (password.equals(userPassword)) {
                System.out.println("Inicio sesion correctamente");
                break;
            } else {
                System.out.println("Password incorrecto.");
                intentos--;
                if (intentos == 0) {
                    System.out.println("Cuenta bloqueada por 60 minutos.");
                } else {
                    System.out.println("Le quedan " + intentos + " intentos...");
                }
            }
        }



    }
}

