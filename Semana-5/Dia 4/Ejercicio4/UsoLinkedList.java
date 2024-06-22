package Ejercicio4;

import java.util.LinkedList;

public class UsoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> lista = new LinkedList<>();

    lista.add("Rojo");
    lista.add("Verde");
    lista.add("Azul");

    System.out.println("Elementos en la LinkedList:");
    for (String color : lista) {
      System.out.println(color);
    }

    lista.removeFirst();
    lista.addLast("Negro");

    System.out.println("Elementos después de modificar la LinkedList:");
    for (String color : lista) {
      System.out.println(color);
    }
  }
}