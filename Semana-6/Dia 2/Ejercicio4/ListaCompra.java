package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra {
  private List<Producto> productos;

  public ListaCompra() {
    this.productos = new ArrayList<>();
  }

  public void agregarProducto(Producto producto) {
    productos.add(producto);
  }

  public void eliminarProducto(Producto producto) {
    productos.remove(producto);
  }

  public void mostrarLista() {
    System.out.println("Lista de la compra:");
    for (Producto producto : productos) {
      System.out.println("- " + producto.getNombre());
    }
  }
}