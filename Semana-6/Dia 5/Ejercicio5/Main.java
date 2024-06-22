package Ejercicio5;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Juan Pérez");
    TarjetaCredito tarjeta = new TarjetaCredito("1234567890", cliente);

    System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
    System.out.println("Número de tarjeta: " + tarjeta.getNumero());
  }
}
