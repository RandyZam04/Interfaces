package Interfaces;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(7, 14);
        FiguraGeometrica triangulo = new Triangulo(5, 8);
        FiguraGeometrica circulo = new Circulo(4);

        System.out.println("----------------------------------");
        System.out.println("| Figura      | Dimensiones       | Área    |");
        System.out.println("----------------------------------");
        System.out.printf("| Rectángulo  | Base: 7, Altura: 14 | %.2f |\n", rectangulo.calcularArea());
        System.out.printf("| Triángulo   | Base: 5, Altura: 8  | %.2f |\n", triangulo.calcularArea());
        System.out.printf("| Círculo     | Radio: 4           | %.2f |\n", circulo.calcularArea());
        System.out.println("----------------------------------");
    }
}
