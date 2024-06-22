public class Vehiculo {
  private String marca;
  private TipoVehiculo tipo;

  public Vehiculo(String marca, TipoVehiculo tipo) {
    this.marca = marca;
    this.tipo = tipo;
  }

  public String getMarca() {
    return marca;
  }

  public TipoVehiculo getTipo() {
    return tipo;
  }
}