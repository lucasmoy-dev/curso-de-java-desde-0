public class NumerosMultiplos {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean esMultiploDe4 = i % 4 == 0;
            boolean esMultiploDe7 = i % 7 == 0;
           if (esMultiploDe4 && esMultiploDe7) {
               System.out.println(i);
           }
        }

    }
}
