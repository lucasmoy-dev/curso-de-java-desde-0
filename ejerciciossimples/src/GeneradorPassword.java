public class GeneradorPassword {
    public static void main(String[] args) {

        String caracteres = "abcdefghijlwzy$!0123456789";
        String password = "";

        int cantidadCaracteres = 10;
        int contador = 0;
        while (contador < cantidadCaracteres) {
            contador++;
            double aleatorio = Math.random();
            aleatorio = Math.floor(aleatorio * caracteres.length());
            int numero = (int) aleatorio;

            password += caracteres.charAt(numero);
        }
        System.out.println(password);

    }
}

