package Ejercicio1;

public class Coche {
  private Motor motor;

  public Coche() {
    this.motor = new Motor();
  }

  public void encender() {
    motor.arrancar();
    System.out.println("El coche ha arrancado");
  }
}
