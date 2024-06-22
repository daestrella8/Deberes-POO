package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nombre;
  private List<Estudiante> estudiantes;

  public Curso(String nombre) {
    this.nombre = nombre;
    this.estudiantes = new ArrayList<>();
  }

  public String getNombre() {
    return this.nombre;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
  }

  public List<Estudiante> getEstudiantes() {
    return estudiantes;
  }
}
