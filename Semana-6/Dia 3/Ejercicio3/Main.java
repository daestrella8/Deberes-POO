package Ejercicio3;

public class Main {
  public static void main(String[] args) {
    Circulo circulo = new Circulo(0, 0, 5);
    System.out.println("Área del círculo: " + circulo.calcularArea());
    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
  }
}
