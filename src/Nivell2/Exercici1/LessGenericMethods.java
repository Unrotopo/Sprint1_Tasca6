package Nivell2.Exercici1;

public class LessGenericMethods<T> {

    private T attribute1;
    private T attribute2;
    private Integer attribute3;

    public LessGenericMethods() {}

    public void print(T attribute1, T attribute2, Integer attribute3) {
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

    public Integer getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(Integer attribute3) {
        this.attribute3 = attribute3;
    }
}
