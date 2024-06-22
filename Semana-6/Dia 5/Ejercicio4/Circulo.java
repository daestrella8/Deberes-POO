package Ejercicio4;

public class Circulo implements Figura {
  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * radio * radio;
  }
}
