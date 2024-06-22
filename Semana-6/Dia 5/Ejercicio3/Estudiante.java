package Ejercicio3;

public class Estudiante {
  private String nombre;
  private Curso curso;

  public Estudiante(String nombre, Curso curso) {
    this.nombre = nombre;
    this.curso = curso;
  }

  public String getNombre() {
    return nombre;
  }

  public Curso getCurso() {
    return curso;
  }
}
