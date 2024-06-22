import java.util.ArrayList;

public class UsoArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();

    numeros.add(10);
    numeros.add(20);
    numeros.add(30);

    System.out.println("Elementos en el ArrayList:");
    for (int num : numeros) {
      System.out.println(num);
    }
  }
}
