package Ejercicio3;

public class Empleado {
  protected String nombre;
  protected double salario;

  public Empleado(String nombre, double salario) {
    this.nombre = nombre;
    this.salario = salario;
  }

  public String getNombre() {
    return nombre;
  }

  public double getSalario() {
    return salario;
  }
}
