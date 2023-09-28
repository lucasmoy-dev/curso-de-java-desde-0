import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTareas {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Armar una clase de Listas en Java");
        lista.add("Editar el video");
        lista.add("Armar la miniatura del video");
        lista.add("Subir el video");

        int opcionElegida = 1;
        while(opcionElegida != 0) {
            System.out.println("Que desea hacer?");
            System.out.println("1) Agregar una tarea");
            System.out.println("2) Completar una tarea");
            System.out.println("3) Mostrar tareas");
            System.out.println("0) Salir");
            Scanner teclado = new Scanner(System.in);
            opcionElegida = teclado.nextInt();

            switch(opcionElegida) {
                case 1:
                    agregarTarea(lista);
                    System.out.println("Listo!");
                    break;

                case 2:
                    mostrarTareas(lista);
                    completarTarea(lista);
                    System.out.println("Listo!");
                    break;

                case 3:
                    mostrarTareas(lista);
                    break;

                case 0: break;
            }
        }
    }

    private static void agregarTarea(List<String> lista) {
        System.out.println("Que tarea deseas agregar?");
        Scanner teclado = new Scanner(System.in);
        String tarea = teclado.nextLine();
        lista.add(tarea);
    }

    private static void mostrarTareas(List<String> lista) {
        int contador = 0;
        System.out.println("Listado de tareas:");
        for (String tarea : lista) {
            contador++;
            System.out.println(contador + ") " + tarea);
        }
    }

    private static void completarTarea(List<String> lista) {
        System.out.println("Que tarea ya completaste?");
        Scanner teclado = new Scanner(System.in);
        int nroTarea = teclado.nextInt();
        lista.remove(nroTarea - 1);
    }

}