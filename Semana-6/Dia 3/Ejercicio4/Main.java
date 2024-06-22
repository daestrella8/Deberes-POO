package Ejercicio4;

public class Main {
  public static void main(String[] args) {
    Figura circulo = new Circulo(5);
    Figura rectangulo = new Rectangulo(3, 4);

    System.out.println("Área del círculo: " + circulo.calcularArea());
    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
  }
}
