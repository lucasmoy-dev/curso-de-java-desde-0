import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int cantAlumnos = teclado.nextInt();

        String[] alumnos = new String[cantAlumnos];
        Float[] promedios = new Float[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = teclado.next();
            alumnos[i] = nombre;

            System.out.println("Ingrese la nota del 1er semestre:");
            float nota1 = teclado.nextFloat();

            System.out.println("Ingrese la nota del 2do semestre:");
            float nota2 = teclado.nextFloat();

            float promedio = (nota1 + nota2) / 2;
            promedios[i] = promedio;

            System.out.println("El promedio de " + nombre
                    + " es: " + promedio);
        }


        for (int i = 0; i < cantAlumnos; i++) {
            String alumno = alumnos[i];
            Float promedio = promedios[i];

            System.out.println(alumno
                    + " - Nota Promedio: "
                    + promedio);
        }
    }
}
