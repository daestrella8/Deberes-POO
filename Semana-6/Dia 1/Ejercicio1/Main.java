public class Main {
  public static void main(String[] args) {
    Persona persona = new Persona("Juan", 30);
    Direccion direccion = new Direccion("Av. Principal", "Ciudad X");
    System.out.println(persona.getNombre() + " vive en " + direccion.getCalle() + ", " + direccion.getCiudad());
  }
}
