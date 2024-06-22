package Ejercicio2;

public class Orden {
  private DetalleOrden detalle;

  public Orden() {
    this.detalle = new DetalleOrden();
  }

  public DetalleOrden getDetalle() {
    return detalle;
  }
}
