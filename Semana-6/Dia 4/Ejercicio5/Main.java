package Ejercicio5;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso("Matemáticas");
    curso.agregarEstudiante(new Estudiante("Pedro"));
    curso.agregarEstudiante(new Estudiante("María"));

    System.out.println("Estudiantes inscritos en " + curso.getNombre() + ":");
    for (Estudiante estudiante : curso.getEstudiantes()) {
      System.out.println("- " + estudiante.getNombre());
    }
  }
}
