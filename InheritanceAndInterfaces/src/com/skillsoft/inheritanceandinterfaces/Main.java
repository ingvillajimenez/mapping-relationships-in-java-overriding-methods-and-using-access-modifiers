package com.skillsoft.inheritanceandinterfaces;

import com.skillsoft.app.ResidentialProperty;

public class Main {

    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty("Iris", 3600);
        System.out.println("Residential property: " + residentialProperty);
//        residentialProperty.printDetails();

        IndustrialProperty industrialProperty = new IndustrialProperty("Acme", 1000000);
        System.out.println("Industrial property: " + industrialProperty);

        Property property = new Property("Plot", "Enclaves", 3450);
        System.out.println(property);

    }
}