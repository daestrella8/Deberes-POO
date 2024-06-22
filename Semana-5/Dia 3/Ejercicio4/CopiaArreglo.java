package Ejercicio4;

import java.util.Arrays;

public class CopiaArreglo {
  public static void main(String[] args) {
    String[] nombres = { "Juan", "María", "Carlos", "Ana" };
    String[] copiaNombres = Arrays.copyOf(nombres, nombres.length);

    System.out.println("Copia del arreglo:");
    for (String nombre : copiaNombres) {
      System.out.println(nombre);
    }
  }
}