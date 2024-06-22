package Ejercicio4;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Ana Gómez");
    CuentaBancaria cuenta1 = new CuentaBancaria(1234, cliente);
    CuentaBancaria cuenta2 = new CuentaBancaria(5678, cliente);

    System.out.println("Cliente: " + cliente.getNombre());
    System.out.println("Cuentas:");
    for (CuentaBancaria cuenta : cliente.getCuentas()) {
      System.out.println("- Número: " + cuenta.getNumero());
    }
  }
}
