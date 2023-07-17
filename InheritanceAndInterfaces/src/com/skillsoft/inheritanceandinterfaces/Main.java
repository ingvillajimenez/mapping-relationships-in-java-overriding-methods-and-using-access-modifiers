package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Property property = Property.getPropertyInstance(
                "Residential", "Alpha", 1200);

//        Property property = new Property("Residential", "Alpha", 1200);
//
        System.out.println("Property: " + property);

    }
}