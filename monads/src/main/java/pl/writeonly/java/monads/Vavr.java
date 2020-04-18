package pl.writeonly.java.monads;

import io.vavr.collection.*;

public class Vavr {
  public static void main(String[] args) {
    final var nestedMap = HashMap.of("Lisp", HashMap.of("Meta Language", HashMap.of("Haskell", "MonadsAreAwesome")));

    System.out.println(nestedMap.get("Lisp").flatMap(v1 -> v1.get("Meta Language")).flatMap(v2 -> v2.get("Haskell")));
    System.out.println(nestedMap.get("Lisp").flatMap(v1 -> v1.get(":(")).flatMap(v2 -> v2.get("Haskell")));
  }
}
