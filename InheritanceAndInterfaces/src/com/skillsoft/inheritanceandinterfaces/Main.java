package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);

        System.out.println("Industrial Property: " + industrialProperty);

        industrialProperty.printDetails();

    }
}