package Ejercicio5;

public class Usuario {
  private Impresora impresora;

  public Usuario(Impresora impresora) {
    this.impresora = impresora;
  }

  public void imprimirDocumento(String documento) {
    impresora.imprimir(documento);
  }
}