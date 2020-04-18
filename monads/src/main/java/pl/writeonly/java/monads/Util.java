package pl.writeonly.java.monads;

import java.util.*;

public class Util {
  public static void main(String[] args) {
    final var nestedMap = Map.of("Lisp", Map.of("Meta Language", Map.of("Haskell", "MonadsAreAwesome")));

    System.out.println(Optional.ofNullable(nestedMap.get("Lisp")).flatMap(v1 -> Optional.ofNullable(v1.get("Meta Language")).flatMap(v2 -> Optional.ofNullable(v2.get("Haskell")))));
    System.out.println(Optional.ofNullable(nestedMap.get("Lisp")).flatMap(v1 -> Optional.ofNullable(v1.get(":(")).flatMap(v2 -> Optional.ofNullable(v2.get("Haskell")))));
  }
}
