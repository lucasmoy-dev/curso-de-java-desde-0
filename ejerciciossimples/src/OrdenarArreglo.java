
public class OrdenarArreglo {

    public static void main(String[] args) {

        int[] arreglo = new int[] { 9,16,2,35, 60, 28, 34};

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                int numeroA = arreglo[j];
                int numeroB = arreglo[j + 1];
                if (numeroA > numeroB) { // SWAP
                    arreglo[j] = numeroB;
                    arreglo[j + 1] = numeroA;
                }
            }
        }

        for (int num:arreglo) {
            System.out.println(num);
        }

    }

}