import java.util.Scanner;

public class EjercicioIngestaCalorica {
//El surgimiento de la Unión Europea.
    // La descolonización de África y Asia.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad:");
        int edad = teclado.nextInt();
        System.out.println("Ingrese la altura en cm:");
        int alturaCm = teclado.nextInt();
        System.out.println("Ingrese el peso en kg:");
        int pesoKg = teclado.nextInt();
        System.out.println("Ingrese el tipo de actividad:");
        System.out.println("1) Personas Sedentarias");
        System.out.println("2) Poca actividad");
        System.out.println("3) Actividad Moderada");
        System.out.println("4) Actividad Intensa");
        System.out.println("5) Atletas profesionales");
        int opcionActividad = teclado.nextInt();

        float factorActiviad = 0;
        switch (opcionActividad) {
            case 1: factorActiviad = 1.2f; break;
            case 2: factorActiviad = 1.375f; break;
            case 3: factorActiviad = 1.55f; break;
            case 4: factorActiviad = 1.725f; break;
            case 5: factorActiviad = 1.9f; break;
        }


        boolean esHombre = true;

        float promedioCalorias = 0;
        if (esHombre) {
            promedioCalorias = (66 + (13.7f * pesoKg)) + ((5 * alturaCm) - (6.8f * edad)) * factorActiviad;
            System.out.println("Promedio de calorias: " + promedioCalorias);
        } else {
            promedioCalorias = (655 + (9.6f * pesoKg)) + ((1.8f * alturaCm) - (4.7f * edad)) * factorActiviad;
            System.out.println("Promedio de calorias: " + promedioCalorias);
        }

        int[] ingestaCalorica = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese las calorias del día " + (i + 1) + ":");
            int calorias = teclado.nextInt();
            ingestaCalorica[i] = calorias;
            System.out.println(ingestaCalorica[i]);
        }

        float caloriasQuemadas = 0;
        for (int i = 0; i < 7; i++) {
            caloriasQuemadas += promedioCalorias - ingestaCalorica[i];
        }

        System.out.println("Total de calorias quemadas: " + caloriasQuemadas);
        float kilosQuemados = caloriasQuemadas / 7700;
        System.out.println("Total de kilos quemados: " + kilosQuemados);

    }

}