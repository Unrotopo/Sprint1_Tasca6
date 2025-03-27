package Nivell1.Exercici1;

public class NoGenericMethods {

    private String argument1;
    private String argument2;
    private String argument3;

    public NoGenericMethods(String argument1, String argument2, String argument3) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
    }

    public String getArgument1() {
        return argument1;
    }

    public void setArgument1(String argument1) {
        this.argument1 = argument1;
    }

    public String getArgument2() {
        return argument2;
    }

    public void setArgument2(String argument2) {
        this.argument2 = argument2;
    }

    public String getArgument3() {
        return argument3;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }

    public String toString() {
        return argument1 + argument2 + argument3;
    }
}
