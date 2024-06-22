package Ejercicio2;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso("Programación");
    curso.agregarEstudiante(new Estudiante("Ana"));
    curso.agregarEstudiante(new Estudiante("Carlos"));

    for (Estudiante estudiante : curso.getEstudiantes()) {
      System.out.println(estudiante.getNombre() + " está inscrito en el curso de " + curso.getNombre());
    }
  }
}
