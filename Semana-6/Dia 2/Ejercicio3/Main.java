package Ejercicio3;

public class Main {
  public static void main(String[] args) {
    Equipo equipo = new Equipo("Equipo A");
    equipo.agregarJugador(new Jugador("Pedro"));
    equipo.agregarJugador(new Jugador("María"));

    System.out.println("Jugadores del " + equipo.getNombre() + ":");
    for (Jugador jugador : equipo.getJugadores()) {
      System.out.println("- " + jugador.getNombre());
    }
  }
}
