package Ejercicio2;

public class ItemFactura {
  private String descripcion;
  private double precio;

  public ItemFactura(String descripcion, double precio) {
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getPrecio() {
    return precio;
  }
}
