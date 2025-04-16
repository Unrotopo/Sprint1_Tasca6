package Nivell2.Exercici2;

import java.util.List;

public class ListGenericMethods {


    public ListGenericMethods() {
    }

    public <T, U, V> void print(List<T> attribute1, List<U> attribute2, List<V> attribute3) {
        System.out.println("---- Attribute 1 ----");
        attribute1.forEach(System.out::println);
        System.out.println("---- Attribute 2 ----");
        attribute2.forEach(System.out::println);
        System.out.println("---- Attribute 3 ----");
        attribute3.forEach(System.out::println);
    }
}
