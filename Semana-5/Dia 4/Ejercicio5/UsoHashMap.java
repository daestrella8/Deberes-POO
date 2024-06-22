package Ejercicio5;

import java.util.HashMap;

public class UsoHashMap {
  public static void main(String[] args) {
    HashMap<String, Integer> poblacion = new HashMap<>();

    poblacion.put("Madrid", 6000000);
    poblacion.put("Barcelona", 5500000);
    poblacion.put("Valencia", 1500000);

    System.out.println("Población por ciudad:");
    for (String ciudad : poblacion.keySet()) {
      System.out.println(ciudad + ": " + poblacion.get(ciudad));
    }
  }
}
