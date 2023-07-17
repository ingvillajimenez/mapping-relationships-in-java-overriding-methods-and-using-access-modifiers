package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);

        System.out.println("Industrial Property: " + industrialProperty);

        industrialProperty.printDetails();

//        Property property = new Property("Residential", "Alpha", 1200);
//
//        System.out.println("Property: " + property);
//        System.out.println("Property toString() (public): " + property.toString());
//
//        property.setPropertySize(2400);
//        System.out.println("\nProperty Size in sqft: " + property.getPropertySize());
//
//        System.out.println("\nProperty type: " + property.propertyType);
//
//        System.out.println("\nProperty project name (private): " + property.projectName);
//        System.out.println("Property formatted string (private): " + property.getFormattedString());
    }
}