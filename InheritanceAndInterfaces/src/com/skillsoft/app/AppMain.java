package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.Property;
import com.skillsoft.inheritanceandinterfaces.IndustrialProperty;

public class AppMain {

    public static void main(String[] args) {

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);

        System.out.println("********Accessing protected members from different package");

        System.out.println("Property Type: " + industrialProperty.propertyType);
        System.out.println("ID: " + industrialProperty.getId());
        System.out.println("Project Name: " + industrialProperty.getProjectName());
        System.out.println("Property Size: " + industrialProperty.getPropertyType());

        System.out.println("Formatted string: " + industrialProperty.getFormattedString());

    }
}
