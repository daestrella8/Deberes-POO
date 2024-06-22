package Ejercicio3;

import java.util.PriorityQueue;

public class UsoPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> numeros = new PriorityQueue<>();

    numeros.add(10);
    numeros.add(5);
    numeros.add(20);

    System.out.println("Elementos en el PriorityQueue:");
    while (!numeros.isEmpty()) {
      System.out.println(numeros.poll());
    }
  }
}
