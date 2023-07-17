package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);

        System.out.println("Industrial Property: " + industrialProperty);

        industrialProperty.printDetails();

//        Property property = new Property("Residential", "Alpha", 1200);
//
//        System.out.println("Property: " + property);
//
//        System.out.println("Property type: " + property.propertyType);
//        System.out.println("ID: " + property.getId());
//        System.out.println("Project name: " + property.getProjectName());
//        System.out.println("Property size: " + property.getPropertySize());
    }
}