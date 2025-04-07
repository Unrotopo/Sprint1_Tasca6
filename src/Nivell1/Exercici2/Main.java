package Nivell1.Exercici2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Mr.X", "Unkowingston", 40);
        Person person2 = new Person("Lady Lisbon", "Freeman", 35);

        GenericMethods<String> genericIsString = new GenericMethods<>();
        GenericMethods<Person> genericIsPerson = new GenericMethods<>();
        GenericMethods<Integer> genericIsInteger = new GenericMethods<>();

        genericIsString.print("lollipop", "umbrella", "potato");
        System.out.println();
        genericIsPerson.print(person1, person2, person1);
        System.out.println();
        genericIsInteger.print(12_005, 0, 23);
    }
}
