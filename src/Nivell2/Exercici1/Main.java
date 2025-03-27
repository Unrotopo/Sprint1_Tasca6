package Nivell2.Exercici1;

public class Main {
    public static void main(String[] args) {

        Person newPerson = new Person("Mr.X", "Unkowingston", 40);
        LessGenericMethods lessGenericMethod = new LessGenericMethods<>();

        lessGenericMethod.print("lollipop", newPerson, 102);
        System.out.println();
        lessGenericMethod.print(true, "?", 12_000);
        System.out.println();
        lessGenericMethod.print(false, 12, 0);
    }
}
