package Nivell1.Exercici2;

public class Main {
    public static void main(String[] args) {

        Person newPerson = new Person("Mr.X", "Unkowingston", 40);
        GenericMethods genericMethod = new GenericMethods<>();

        genericMethod.print("lollipop", newPerson, 12_000);
    }
}
