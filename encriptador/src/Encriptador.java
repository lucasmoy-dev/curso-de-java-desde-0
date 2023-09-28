public class Encriptador {

    private Integer clave = 1;

    public void setClave(Integer clave) {
        this.clave = clave;
    }
    public String encriptar(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            int codigoAscii = texto.charAt(i);
            codigoAscii = codigoAscii * clave;
            resultado += codigoAscii + "_";
        }
        return resultado;
    }

    public String desencriptar(String texto) {
        String resultado = "";
        String[] numeros = texto.split("_");
        for (int i = 0; i < numeros.length; i++) {
            String strNumero = numeros[i];
            int numero = Integer.parseInt(strNumero);
            numero = numero / clave;
            char caracter = (char) numero;
            String letra = Character.toString(caracter);
            resultado += letra;
        }
        return resultado;
    }
}
