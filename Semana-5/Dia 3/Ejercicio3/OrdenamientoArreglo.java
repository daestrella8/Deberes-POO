package Ejercicio3;

import java.util.Arrays;

public class OrdenamientoArreglo {
  public static void main(String[] args) {
    int[] numeros = { 5, 1, 9, 3, 7 };
    Arrays.sort(numeros);

    System.out.println("Arreglo ordenado:");
    for (int num : numeros) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
