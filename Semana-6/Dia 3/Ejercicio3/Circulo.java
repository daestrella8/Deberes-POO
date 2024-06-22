package Ejercicio3;

public class Circulo {
  private Punto centro;
  private double radio;

  public Circulo(double x, double y, double radio) {
    this.centro = new Punto(x, y);
    this.radio = radio;
  }

  public double calcularArea() {
    return Math.PI * radio * radio;
  }

  public double calcularPerimetro() {
    return 2 * Math.PI * radio;
  }

  public Punto getCentro() {
    return this.centro;
  }

  public void setCentro(Punto centro) {
    this.centro = centro;
  }

  public double getRadio() {
    return this.radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

}
