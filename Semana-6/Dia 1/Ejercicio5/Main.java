package Ejercicio5;

public class Main {
  public static void main(String[] args) {
    Tienda tienda = new Tienda("Supermercado XYZ");
    tienda.agregarProducto(new Producto("Leche"));
    tienda.agregarProducto(new Producto("Pan"));

    tienda.listarProductos();
  }
}
