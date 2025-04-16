package Nivell2.Exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListGenericMethods listGenericMethods = new ListGenericMethods();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list2 = Arrays.asList("one", "two", "three", "four", "five");
        List<Person> list3 = Arrays.asList(
                new Person("John", "Sanders", 30),
                new Person("Jane", "Wilkins", 25),
                new Person("Jack", "Sparrow", 35));

        listGenericMethods.print(list1, list2, list3);
    }
}
