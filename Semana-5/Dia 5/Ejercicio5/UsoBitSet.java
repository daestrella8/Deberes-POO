package Ejercicio5;

import java.util.BitSet;

public class UsoBitSet {
  public static void main(String[] args) {
    BitSet bits1 = new BitSet(16);
    BitSet bits2 = new BitSet(16);

    bits1.set(0);
    bits1.set(2);
    bits1.set(4);

    bits2.set(1);
    bits2.set(3);
    bits2.set(5);

    System.out.println("bits1: " + bits1);
    System.out.println("bits2: " + bits2);

    bits1.and(bits2);
    System.out.println("bits1 AND bits2: " + bits1);

    bits1.or(bits2);
    System.out.println("bits1 OR bits2: " + bits1);

    bits1.xor(bits2);
    System.out.println("bits1 XOR bits2: " + bits1);
  }
}
