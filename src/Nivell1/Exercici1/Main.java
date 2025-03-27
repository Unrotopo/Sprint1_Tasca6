package Nivell1.Exercici1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods normalGreeting = new NoGenericMethods("Hello ", "there, ", "human!");
        NoGenericMethods weirdGreeting = new NoGenericMethods("Hello ", "human, ", "there!");
        NoGenericMethods nonsenseGreeting = new NoGenericMethods("There ", "human, ", "hello!");

        System.out.println(normalGreeting);
        System.out.println(weirdGreeting);
        System.out.println(nonsenseGreeting);
    }
}
