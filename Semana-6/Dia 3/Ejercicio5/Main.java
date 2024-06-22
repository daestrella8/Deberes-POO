package Ejercicio5;

public class Main {
  public static void main(String[] args) {
    Impresora impresora = new Impresora();
    Usuario usuario = new Usuario(impresora);

    usuario.imprimirDocumento("Informe de ventas");
  }
}
