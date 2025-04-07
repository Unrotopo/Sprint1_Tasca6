package Nivell2.Exercici1;

public class Main {
    public static void main(String[] args) {

        Nivell2.Exercici1.Person person1 = new Nivell2.Exercici1.Person("Mr.X", "Unkowingston", 40);
        Nivell2.Exercici1.Person person2 = new Nivell2.Exercici1.Person("Lady Lisbon", "Freeman", 35);

        LessGenericMethods<String> genericToString = new LessGenericMethods<>();
        LessGenericMethods<Person> genericToPerson = new LessGenericMethods<>();
        LessGenericMethods<Boolean> genericToBoolean = new LessGenericMethods<>();

        genericToString.print("lollipop", "?", 102);
        System.out.println();
        genericToPerson.print(person1, person2, 12_000);
        System.out.println();
        genericToBoolean.print(false, true, 0);

        // genericToBoolean.print(false, true, "hola"); --> Argumento 3 DEBE ser un Integer
    }
}
