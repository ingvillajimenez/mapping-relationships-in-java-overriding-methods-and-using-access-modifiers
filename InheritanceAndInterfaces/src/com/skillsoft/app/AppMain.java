package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.IndustrialProperty;
import com.skillsoft.inheritanceandinterfaces.Property;

public class AppMain {

    public static void main(String[] args) {

        Property property = new Property("Residential", "Alpha", 1200);

        System.out.println("Property: " + property);
        System.out.println("Property toString() (public): " + property.toString());

        property.setPropertySize(2400);
        System.out.println("\nProperty Size in sqft: " + property.getPropertySize());

        System.out.println("Property type: " + property.propertyType);

        System.out.println("\nProperty project name (private): " + property.projectName);
        System.out.println("Property formatted string (private): " + property.getFormattedString());

    }
}