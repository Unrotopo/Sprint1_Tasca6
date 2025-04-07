package Nivell1.Exercici1;

public class Main {
    public static void main(String[] args) {

        String arg1 = "Hello ";
        String arg2 = "there, ";
        String arg3 = "human!";

        NoGenericMethods normalGreeting = new NoGenericMethods(arg1, arg2, arg3);
        NoGenericMethods weirdGreeting = new NoGenericMethods(arg1, arg3, arg2);
        NoGenericMethods nonsenseGreeting = new NoGenericMethods(arg2, arg3, arg1);

        System.out.println(normalGreeting);
        System.out.println(weirdGreeting);
        System.out.println(nonsenseGreeting);
    }
}
