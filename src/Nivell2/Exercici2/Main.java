package Nivell2.Exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListGenericMethods listGenericMethods = new ListGenericMethods();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list2 = Arrays.asList("one", "two", "three", "four", "five");

        listGenericMethods.print(list1, 102);
        System.out.println();
        listGenericMethods.print(list2, 12_000);
    }
}
