public class CalculadoraDeProspectos {

    public static void main(String[] args) {
        int prospectos = 10000000;
        int costoDeEnvioEmail = prospectos / 100000;
        int precioDelServcio = 10;
        System.out.println("Etapa inicial: Hay " + prospectos + " prospectos");

        prospectos = filtrarProspectos("Se le envia un email", prospectos, 25);
        prospectos = filtrarProspectos("El prospecto ingresa a la web", prospectos, 10);
        prospectos = filtrarProspectos("El prospecto ingresa a la seccion de compras", prospectos, 10);
        prospectos = filtrarProspectos("El prospecto compra el servicio", prospectos, 10);

        int precioFinal = prospectos * precioDelServcio - costoDeEnvioEmail;
        System.out.println("Ganancias totales: $" + precioFinal);
    }

    private static int filtrarProspectos(String etapa, int prospectos, int porcentaje) {
        prospectos = porcentaje * prospectos / 100;
        System.out.println("Etapa: " + etapa);
        System.out.println("Prospectos restantes: " + prospectos);
        return prospectos;
    }
}