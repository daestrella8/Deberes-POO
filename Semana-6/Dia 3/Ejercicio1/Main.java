public class Main {
  public static void main(String[] args) {
    Casa miCasa = new Casa("Av. Principal 123");
    miCasa.agregarHabitacion(new Habitacion("Dormitorio"));
    miCasa.agregarHabitacion(new Habitacion("Baño"));

    System.out.println("Mi casa tiene " + miCasa.contarHabitaciones() + " habitaciones.");
  }
}
