import java.util.Scanner;

public class GarbageCollector {

    private String variable1;
    private String variable2;

    public static void main(String[] args) {
        GarbageCollector gb = new GarbageCollector();
        gb.setVariable1("Hola");
        gb.setVariable2("Hola");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        teclado.nextLine();
        Runtime.getRuntime().gc();
    }

    public void ejemploGarbageCollector() {
        Integer a = 123;
       // Persona p = new Persona();
       // p.calcularSalario();
    }


    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }
}
