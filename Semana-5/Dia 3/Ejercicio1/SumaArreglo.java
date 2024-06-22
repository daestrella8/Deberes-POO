public class SumaArreglo {
  public static void main(String[] args) {
      int[] numeros = {1, 2, 3, 4, 5};
      int suma = 0;
      
      for (int num : numeros) {
          suma += num;
      }
      
      System.out.println("La suma de los elementos del arreglo es: " + suma);
  }
}