package Ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;

public class EliminarDuplicados {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(5);
    numeros.add(2);
    numeros.add(5);
    numeros.add(1);
    numeros.add(2);

    HashSet<Integer> conjunto = new HashSet<>(numeros);
    numeros.clear();
    numeros.addAll(conjunto);

    System.out.println("ArrayList sin duplicados:");
    for (int num : numeros) {
      System.out.println(num);
    }
  }
}
