package Nivell3.Exercici1;

import Nivell3.Exercici1.entities.Generic;
import Nivell3.Exercici1.entities.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();
        Generic generic = new Generic();

        generic.genericPhone(smartphone);
        generic.genericSmartphone(smartphone);
    }
}
