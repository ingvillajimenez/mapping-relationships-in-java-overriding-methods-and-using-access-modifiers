package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        OnePlus onePlus = new OnePlus(499, true);
        IPhone iPhone = new IPhone6S(1199, true);

//        Phone motorola = new Phone("Android", "Moto G", 299);

        System.out.println("One Plus: " + onePlus);
        System.out.println("iPhone: " + iPhone);
//        System.out.println("Motorola: " + motorola);

        System.out.println("One Plus price: " + onePlus.computeTotalPrice());
        System.out.println("iPhone price: " + iPhone.computeTotalPrice());

    }
}