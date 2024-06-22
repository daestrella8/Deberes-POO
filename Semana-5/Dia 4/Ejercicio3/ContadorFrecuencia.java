package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;

public class ContadorFrecuencia {
  public static void main(String[] args) {
    ArrayList<String> palabras = new ArrayList<>();
    palabras.add("Hola");
    palabras.add("Mundo");
    palabras.add("Hola");
    palabras.add("Java");

    HashMap<String, Integer> contador = new HashMap<>();

    for (String palabra : palabras) {
      contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
    }

    System.out.println("Frecuencia de palabras:");
    for (String key : contador.keySet()) {
      System.out.println(key + ": " + contador.get(key));
    }
  }
}
