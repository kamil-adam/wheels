package pl.writeonly.java.monads;

import io.vavr.collection.*;

public class Vavr {
  public static void main(String[] args) {
    final var nestedMap = HashMap.of("key1", HashMap.of("key2", HashMap.of("key3", "someValue")));

    System.out.println(nestedMap.get("key1").flatMap(v1 -> v1.get("key2")).flatMap(v2 -> v2.get("key3")));
    System.out.println(nestedMap.get("key1").flatMap(v1 -> v1.get(":()")).flatMap(v2 -> v2.get("key3")));
  }
}
