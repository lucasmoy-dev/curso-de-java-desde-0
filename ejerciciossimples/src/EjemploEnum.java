public class EjemploEnum {

    public static void main(String[] args) {

        Dia hoy = Dia.SABADO;

        if (hoy.getEsFinDeSemana()) {
            System.out.println("Me voy de joda");
        } else {
            System.out.println("A trabajar");
        }
    }
}
