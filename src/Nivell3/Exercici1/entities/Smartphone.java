package Nivell3.Exercici1.entities;

import Nivell3.Exercici1.interfaces.Phone;

public class Smartphone implements Phone {

    public void call() {
        System.out.println("Smartphone is calling!");
    }

    public void takePhoto() {
        System.out.println("Smartphone is taking a photo!");
    }
}
