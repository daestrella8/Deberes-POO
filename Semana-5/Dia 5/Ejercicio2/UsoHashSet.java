package Ejercicio2;

import java.util.HashSet;

public class UsoHashSet {
  public static void main(String[] args) {
    HashSet<String> colores = new HashSet<>();

    colores.add("Rojo");
    colores.add("Verde");
    colores.add("Azul");
    colores.add("Rojo");

    System.out.println("Elementos en el HashSet:");
    for (String color : colores) {
      System.out.println(color);
    }
  }
}
