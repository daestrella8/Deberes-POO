package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Factura {
  private int numero;
  private List<ItemFactura> items;

  public Factura(int numero) {
    this.numero = numero;
    this.items = new ArrayList<>();
  }

  public void agregarItem(ItemFactura item) {
    items.add(item);
  }

  public List<ItemFactura> getItems() {
    return items;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setItems(List<ItemFactura> items) {
    this.items = items;
  }

}