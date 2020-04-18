package pl.writeonly.java.monads;

import java.util.Map;
import static java.util.Optional.ofNullable;

public class Static {
  public static void main(String[] args) {
    final var nestedMap = Map.of("Lisp", Map.of("Meta Language", Map.of("Haskell", "MonadsAreAwesome")));

    System.out.println(ofNullable(nestedMap.get("Lisp")).flatMap(v1 -> ofNullable(v1.get("Meta Language")).flatMap(v2 -> ofNullable(v2.get("Haskell")))));
    System.out.println(ofNullable(nestedMap.get("Lisp")).flatMap(v1 -> ofNullable(v1.get(":(")).flatMap(v2 -> ofNullable(v2.get("Haskell")))));
  }
}
