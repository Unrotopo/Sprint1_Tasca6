package Nivell3.Exercici1.entities;

import Nivell3.Exercici1.interfaces.Phone;

public class Generic {

    public <T extends Phone> void genericPhone(T device) {
        device.call();
        // device.takePhoto(); NOT ALLOWED!
    }

    public <T extends Smartphone> void genericSmartphone(T device) {
        device.call();
        device.takePhoto();
    }
}
