package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.Property;

public class AppMain {

    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty("Dahlia", 3600);

        System.out.println("Residential Property: " + residentialProperty);

        residentialProperty.printDetails();

//        Property property = new Property("Commercial", "Delta", 7000);
//
//        System.out.println("Property: " + property);
//
//        System.out.println("Property type: " + property.propertyType);
//        System.out.println("ID: " + property.getId());
//        System.out.println("Project name: " + property.getProjectName());
//        System.out.println("Property size: " + property.getPropertySize());
    }
}
