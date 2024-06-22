package Ejercicio2;

public class Archivo {
  private Lector lector;

  public Archivo() {
    this.lector = new Lector();
  }

  public void leerArchivo(String nombreArchivo) {
    lector.abrir(nombreArchivo);
    lector.leer();
    lector.cerrar();
  }
}
