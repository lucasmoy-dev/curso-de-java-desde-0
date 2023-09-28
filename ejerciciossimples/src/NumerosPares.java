public class NumerosPares {
    public static void main(String[] args) {

        // Option 1
        /*
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        */

        // Option 2
        /*
        for (int i = 1; i <= 100; i++) {
           boolean esPar = i % 2 == 0;
           if (esPar) {
               System.out.println(i);
           }
        }*/

        // Option 3
        for (int i = 1; i <= 100; i++) {
            double divisor = 2;
            double num1 = i / divisor;
            double num2 = Math.floor(i / divisor);
            if (num1 == num2) {
                System.out.println(i);
            }
        }

    }
}
