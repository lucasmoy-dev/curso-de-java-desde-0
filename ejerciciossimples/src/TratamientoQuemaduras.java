import java.util.Scanner;

public class TratamientoQuemaduras {

    public static void main(String[] args) {

        System.out.println("Primero tienes que reconocer que tipo de quemadura es:");
        System.out.println("- Primer grado:");
        System.out.println("Enrojecimiento, dolor leve y posible hinchazón.");

        System.out.println("- Segundo grado:");
        System.out.println("Ampollas, enrojecimiento, dolor intenso e hinchazón.");

        System.out.println("- Tercer grado:");
        System.out.println("Piel carbonizada, área insensible y potencialmente grave hinchazón y daño tisular.");

        System.out.println("Ingrese el tipo de quemadura:");
        System.out.println("1) Primer grado");
        System.out.println("2) Segundo grado");
        System.out.println("3) Tercer grado");

        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();

        if (eleccion == 1) {
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua fría del grifo durante al menos 10 minutos.");
            System.out.println("2. Cubrir la quemadura con un apósito estéril o una compresa limpia.");
            System.out.println("3. Tomar un analgésico de venta libre si es necesario para aliviar el dolor.");
        }
        else if (eleccion == 2) {
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua fría del grifo durante al menos 10 minutos.");
            System.out.println("2. No romper las ampollas si las hay.");
            System.out.println("3. Cubrir la quemadura con un apósito estéril o una compresa limpia.");
            System.out.println("4. Buscar atención médica para evaluar el tratamiento adicional.");
        }
        else if (eleccion == 3) {
            System.out.println("Tratamiento:");
            System.out.println("1. Llamar al 911 o acudir a la sala de emergencias de inmediato.");
            System.out.println("2. No intentar tratar la quemadura en casa.");
            System.out.println("3. Mantener al paciente lo más cómodo posible y elevar la zona quemada si es posible.");
        }
    }

}
