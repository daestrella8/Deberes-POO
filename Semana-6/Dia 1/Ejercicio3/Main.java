package Ejercicio3;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Juan Pérez");
    CuentaBancaria cuenta = new CuentaBancaria(cliente);

    System.out.println("La cuenta pertenece a: " + cuenta.getCliente().getNombre());
  }
}
