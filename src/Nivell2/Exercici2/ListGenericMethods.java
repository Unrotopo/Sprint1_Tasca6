package Nivell2.Exercici2;

import java.util.List;

public class ListGenericMethods {

    private List<?> attribute1;
    private Integer attribute3;

    public ListGenericMethods() {}

    public void print(List<?> attribute1, Integer attribute3) {
        attribute1.forEach(System.out::println);
        System.out.println(attribute3);
    }

    public List<?> getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(List<?> attribute1) {
        this.attribute1 = attribute1;
    }

    public Integer getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(Integer attribute3) {
        this.attribute3 = attribute3;
    }
}
