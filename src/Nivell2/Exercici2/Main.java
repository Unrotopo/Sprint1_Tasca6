package Nivell2.Exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListGenericMethods listGenericMethods = new ListGenericMethods();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list2 = Arrays.asList("one", "two", "three", "four", "five");
        List<?> list3 = Arrays.asList(1, 2, 3, "four", "five");

        listGenericMethods.print(list1, 102);
        System.out.println();
        listGenericMethods.print(list2, 12_000);
        System.out.println();
        listGenericMethods.print(list3, 1_000_000);
    }
}
