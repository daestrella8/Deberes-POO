package Ejercicio3;

public class Gerente extends Empleado {
  private String departamento;

  public Gerente(String nombre, double salario, String departamento) {
    super(nombre, salario);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }
}
