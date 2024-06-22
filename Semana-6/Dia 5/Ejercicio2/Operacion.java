package Ejercicio2;

public class Operacion {
  public void realizarOperaciones() {
    int resultadoSuma = Calculadora.sumar(10, 5);
    int resultadoResta = Calculadora.restar(10, 5);

    System.out.println("Suma: " + resultadoSuma);
    System.out.println("Resta: " + resultadoResta);
  }
}
