package Ejercicio3;

public class Main {
  public static void main(String[] args) {
    Curso curso = new CursoInformatica();
    Estudiante estudiante = new Estudiante("Carlos", curso);

    System.out.println(estudiante.getNombre() + " está inscrito en el curso de " + estudiante.getCurso().getNombre());
  }
}
