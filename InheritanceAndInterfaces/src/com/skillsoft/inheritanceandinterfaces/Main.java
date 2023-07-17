package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);

        System.out.println("********Accessing protected members from the same package");

        System.out.println("Property Type: " + industrialProperty.propertyType);
        System.out.println("ID: " + industrialProperty.getId());
        System.out.println("Project Name: " + industrialProperty.getProjectName());
        System.out.println("Property Size: " + industrialProperty.getPropertyType());

        System.out.println("Formatted string: " + industrialProperty.getFormattedString());

//        System.out.println("Industrial Property: " + industrialProperty);
//
//        industrialProperty.printDetails();

    }
}