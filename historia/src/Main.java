import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del personaje principal:");
        String nombrePersonaje = teclado.nextLine();
        System.out.println("Ingrese el nombre del pueblo:");
        String pueblo = teclado.nextLine();
        
        String cuento = "Había una vez un pequeño pueblo llamado " + pueblo + " rodeado por un frondoso bosque. Este no era un bosque común y corriente, sino un lugar mágico donde los árboles susurraban secretos al viento y los animales tenían habilidades extraordinarias.\n" +
                "\n" +
                "En el centro del pueblo vivía un joven llamado " + nombrePersonaje + ", quien siempre había sentido una profunda conexión con la naturaleza. A menudo pasaba horas explorando el bosque y escuchando las historias que los árboles compartían. Un día, mientras se aventuraba más allá de lo conocido, encontró un claro bañado por la luz de la luna. En el centro de este claro había una fuente de aguas centelleantes que parecían teñidas de magia.\n" +
                "\n" +
                "Al acercarse, " + nombrePersonaje + " escuchó un susurro suave y melodioso proveniente de la fuente. \"Aquel que beba de estas aguas con un corazón puro y deseos sinceros, será bendecido con un don extraordinario\", decía la voz misteriosa. " + nombrePersonaje + " se sintió lleno de emoción y decidió beber del agua con la esperanza de que su don fuera utilizar la magia para sanar.\n" +
                "\n" +
                "Al día siguiente, " + nombrePersonaje + " despertó sintiéndose diferente. Cuando tocó un árbol, pudo sentir sus pensamientos y emociones. Descubrió que había adquirido el don de la empatía con la naturaleza. Los árboles le contaron historias de tiempos pasados, los animales compartieron sus alegrías y preocupaciones, y las flores le revelaron sus deseos más profundos.\n" +
                "\n" +
                "" + nombrePersonaje + " decidió usar su nuevo don para el bien de su pueblo. Escuchando las preocupaciones de los árboles, descubrió que había un problema grave: la tala excesiva estaba poniendo en peligro el equilibrio del bosque. Con su empatía, reunió a los aldeanos y les compartió la historia del bosque encantado y su fragilidad.\n" +
                "\n" +
                "El pueblo decidió unirse para proteger el bosque. Plantaron nuevos árboles, establecieron reglas para la tala responsable y se comprometieron a cuidar el entorno natural que los rodeaba. " + nombrePersonaje + " continuó actuando como el enlace entre los habitantes del pueblo y el bosque, asegurándose de que la armonía prevaleciera.\n" +
                "\n" +
                "Con el tiempo, la fama del bosque encantado y su protector, " + nombrePersonaje + ", se extendió por tierras lejanas. Personas de todas partes venían a escuchar las historias del joven que podía hablar con los árboles y los animales. El bosque prosperó, llenándose de vida y magia gracias al cuidado y respeto que le brindaron.\n" +
                "\n" +
                "Y así, el pueblo y el bosque encantado vivieron en paz y armonía, recordando siempre que la magia más poderosa no era la que otorgaba dones extraordinarios, sino la que emanaba del corazón puro y el deseo sincero de proteger y cuidar el mundo que nos rodea.\n" +
                "\n";

        System.out.println(cuento);
    }
}
