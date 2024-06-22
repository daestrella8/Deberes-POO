package Ejercicio5;

public class TarjetaCredito {
  private String numero;
  private Cliente cliente;

  public TarjetaCredito(String numero, Cliente cliente) {
    this.numero = numero;
    this.cliente = cliente;
  }

  public String getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }
}
