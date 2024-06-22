package Ejercicio4;

import java.util.ArrayDeque;

public class UsoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> deque = new ArrayDeque<>();

    deque.push("Uno");
    deque.push("Dos");
    deque.push("Tres");

    System.out.println("Elementos en el ArrayDeque como pila:");
    while (!deque.isEmpty()) {
      System.out.println(deque.pop());
    }

    deque.addLast("Cuatro");
    deque.addLast("Cinco");

    System.out.println("Elementos en el ArrayDeque como cola:");
    while (!deque.isEmpty()) {
      System.out.println(deque.poll());
    }
  }
}