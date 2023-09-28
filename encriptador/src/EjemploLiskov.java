
class Figura {
    public double calcularArea() {
        return 0.0;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class EjemploLiskov {
    public static void mostrarArea(Figura figura) {
        double area = figura.calcularArea();
        System.out.println("El área es: " + area);
    }

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5.0);
        Figura circulo = new Circulo(3.0);

        mostrarArea(cuadrado);  // Esto funciona porque Cuadrado es una Figura
        mostrarArea(circulo);   // Esto también funciona porque Circulo es una Figura
    }
}