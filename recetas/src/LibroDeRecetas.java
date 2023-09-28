import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroDeRecetas {

    public void elegirReceta() {
        List<Receta> recetas = new ArrayList<>();
        Receta mofongo = getMofongo();

        Receta helado = new Receta();
        helado.setNombre("Helado Frito");

        Receta zurek = new Receta();
        zurek.setNombre("Zurek");

        recetas.add(mofongo);
        recetas.add(helado);
        recetas.add(zurek);

        System.out.println("Que receta deseas cocinar?");
        int contador = 1;
        for (Receta receta : recetas) {
            System.out.println(contador + ") " + receta.getNombre());
            contador++;
        }

        Scanner teclado = new Scanner(System.in);
        String opcionElegida = teclado.nextLine();
        int indice = Integer.parseInt(opcionElegida) - 1;
        Receta receta = recetas.get(indice);
        receta.mostrarIngredientes();
        receta.mostrarPasos();
    }

    private Receta getMofongo() {
        Receta mofongo = new Receta();
        mofongo.setNombre("Mofongo");

        List<Ingrediente> listaDeIngredientes = new ArrayList<>();
        listaDeIngredientes.add(new Ingrediente("platanos verdes",
                3, null));
        listaDeIngredientes.add(new Ingrediente("dientes de ajo",
                5, null));
        listaDeIngredientes.add(new Ingrediente("aceite de oliva",
                4, UnidadMedida.CUCHARITAS));
        listaDeIngredientes.add(new Ingrediente("chicharrones de cerdo",
                6, null, true));

        mofongo.setIngredientes(listaDeIngredientes);
        List<String> pasos = new ArrayList<>();
        pasos.add("Pela los plátanos verdes cortando los extremos y haciendo un corte a lo largo de la cáscara. Luego, desprende la cáscara con cuidado.");
        pasos.add("Corta los plátanos en trozos de aproximadamente una pulgada de grosor.");
        pasos.add("Calienta el aceite de oliva o la manteca de cerdo en una sartén grande a fuego medio-alto.");
        pasos.add("Agrega los trozos de plátano y fríelos hasta que estén dorados y crujientes por fuera, alrededor de 5-7 minutos por cada lado.");
        pasos.add("Retira los plátanos fritos y colócalos sobre papel absorbente para eliminar el exceso de aceite.");
        pasos.add("Toma porciones del mofongo machacado y dale forma de bolas o colócalo en moldes para darle una forma específica.");
        pasos.add("Desmolda el mofongo en platos individuales.");
        mofongo.setPasos(pasos);
        return mofongo;
    }
}
