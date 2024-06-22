package Ejercicio4;

public class Linea {
  private Punto puntoInicial;
  private Punto puntoFinal;

  public Linea(double x1, double y1, double x2, double y2) {
    this.puntoInicial = new Punto(x1, y1);
    this.puntoFinal = new Punto(x2, y2);
  }

  public double calcularLongitud() {
    return Math.sqrt(Math.pow(puntoFinal.getX() - puntoInicial.getX(), 2) +
        Math.pow(puntoFinal.getY() - puntoInicial.getY(), 2));
  }
}
