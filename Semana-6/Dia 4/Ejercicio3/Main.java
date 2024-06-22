package Ejercicio3;

public class Main {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Ana", 5000, "Ventas");
    System.out.println("Nombre: " + gerente.getNombre());
    System.out.println("Salario: $" + gerente.getSalario());
    System.out.println("Departamento: " + gerente.getDepartamento());
  }
}
