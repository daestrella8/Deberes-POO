package Ejercicio2;

public class BusquedaArreglo {
  public static void main(String[] args) {
    String[] nombres = { "Juan", "María", "Carlos", "Ana" };
    String nombreBuscado = "Carlos";
    boolean encontrado = false;

    for (String nombre : nombres) {
      if (nombre.equals(nombreBuscado)) {
        encontrado = true;
        break;
      }
    }

    if (encontrado) {
      System.out.println("El nombre " + nombreBuscado + " está en el arreglo.");
    } else {
      System.out.println("El nombre " + nombreBuscado + " no está en el arreglo.");
    }
  }
}
