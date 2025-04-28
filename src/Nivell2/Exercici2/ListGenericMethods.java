package Nivell2.Exercici2;

import java.util.List;

public class ListGenericMethods {


    public ListGenericMethods() {
    }

    public void print(List<?>... attribute) {
        for (List<?> list : attribute) {
            System.out.println(list);
        }
    }
}
