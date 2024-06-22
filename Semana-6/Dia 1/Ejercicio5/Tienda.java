package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
  private String nombre;
  private List<Producto> inventario;

  public Tienda(String nombre) {
    this.nombre = nombre;
    this.inventario = new ArrayList<>();
  }

  public void agregarProducto(Producto producto) {
    inventario.add(producto);
  }

  public List<Producto> getInventario() {
    return inventario;
  }

  public void listarProductos() {
    System.out.println("Productos en " + nombre + ":");
    for (Producto producto : inventario) {
      System.out.println("- " + producto.getNombre());
    }
  }
}
