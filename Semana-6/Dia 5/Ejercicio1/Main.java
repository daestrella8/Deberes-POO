public class Main {
  public static void main(String[] args) {
    Vehiculo vehiculo1 = new Vehiculo("Toyota", TipoVehiculo.COCHE);
    Vehiculo vehiculo2 = new Vehiculo("Honda", TipoVehiculo.MOTOCICLETA);

    System.out.println("Vehículo 1: " + vehiculo1.getMarca() + ", Tipo: " + vehiculo1.getTipo());
    System.out.println("Vehículo 2: " + vehiculo2.getMarca() + ", Tipo: " + vehiculo2.getTipo());
  }
}