package Ejercicio4;

public class CuentaBancaria {
  private int numero;
  private Cliente cliente;

  public CuentaBancaria(int numero, Cliente cliente) {
    this.numero = numero;
    this.cliente = cliente;
    cliente.agregarCuenta(this);
  }

  public Cliente getCliente() {
    return cliente;
  }

  public int getNumero() {
    return numero;
  }
}
