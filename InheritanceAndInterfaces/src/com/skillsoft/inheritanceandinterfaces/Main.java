package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        OnePlus onePlus = new OnePlus(499, true);
        IPhone iPhone = new IPhone(1199, true);

//        Phone motorola = new Phone("Android", "Moto G", 299);

        System.out.println("One Plus: " + onePlus);
        System.out.println("iPhone: " + iPhone);
//        System.out.println("Motorola: " + motorola);

    }
}