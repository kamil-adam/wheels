package pl.writeonly.java.monads;

import java.util.*;

public class Util {
  public static void main(String[] args) {
    final var nestedMap = Map.of("key1", Map.of("key2", Map.of("key3", "MonadsAreAwesome")));

    System.out.println(Optional.ofNullable(nestedMap.get("key1")).flatMap(v1 -> Optional.ofNullable(v1.get("key2")).flatMap(v2 -> Optional.ofNullable(v2.get("key3")))));
    System.out.println(Optional.ofNullable(nestedMap.get("key1")).flatMap(v1 -> Optional.ofNullable(v1.get(":()")).flatMap(v2 -> Optional.ofNullable(v2.get("key3")))));
  }
}
