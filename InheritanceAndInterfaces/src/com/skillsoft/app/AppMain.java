package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.Property;

public class AppMain {

    public static void main(String[] args) {

        Property property = Property.getPropertyInstance(
                "Commercial", "Beta", 4200);

//        Property property = new Property("Commercial", "Beta", 4200);
//
        System.out.println("Property: " + property);
//        System.out.println("Property toString() (public): " + property.toString());

//        property.setPropertySize(2400);
//        System.out.println("\nProperty Size in sqft: " + property.getPropertySize());
//
//        System.out.println("Property type: " + property.propertyType);

//        System.out.println("\nProperty project name (private): " + property.projectName);
//        System.out.println("Property formatted string (private): " + property.getFormattedString());

//        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);
//
//        System.out.println("\nIndustrial Property: " + industrialProperty);
//
//        industrialProperty.printDetails();
    }
}
