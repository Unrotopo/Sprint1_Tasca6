package Nivell1.Exercici2;

public class GenericMethods<T> {

    private T attribute1;
    private T attribute2;
    private T attribute3;

    public GenericMethods () {}

    public void print(T attribute1, T attribute2, T attribute3) {
        System.out.println("attribute1: " + attribute1);
        System.out.println("attribute2: " + attribute2);
        System.out.println("attribute3: " + attribute3);
    }

    public T getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(T attribute1) {
        this.attribute1 = attribute1;
    }

    public T getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(T attribute2) {
        this.attribute2 = attribute2;
    }

    public T getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(T attribute3) {
        this.attribute3 = attribute3;
    }
}
