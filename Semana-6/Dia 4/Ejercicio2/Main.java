package Ejercicio2;

public class Main {
  public static void main(String[] args) {
    Factura factura = new Factura(1);
    factura.agregarItem(new ItemFactura("Producto A", 50.0));
    factura.agregarItem(new ItemFactura("Producto B", 30.0));

    System.out.println("Items de la factura " + factura.getNumero() + ":");
    for (ItemFactura item : factura.getItems()) {
      System.out.println("- " + item.getDescripcion() + ": $" + item.getPrecio());
    }
  }
}
