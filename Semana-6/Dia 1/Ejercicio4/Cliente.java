package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nombre;
  private List<CuentaBancaria> cuentas;

  public Cliente(String nombre) {
    this.nombre = nombre;
    this.cuentas = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarCuenta(CuentaBancaria cuenta) {
    cuentas.add(cuenta);
  }

  public List<CuentaBancaria> getCuentas() {
    return cuentas;
  }
}
