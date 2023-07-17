package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.Property;
import com.skillsoft.inheritanceandinterfaces.IndustrialProperty;

public class AppMain {

    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty("Dahlia", 3600);
        System.out.println("Residential property: " + residentialProperty);
//        residentialProperty.printDetails();

        IndustrialProperty industrialProperty = new IndustrialProperty("Harmony", 1000000);
        System.out.println("Industrial property: " + industrialProperty);

        Property property = new Property("Plot", "Hill Valley", 3450);
        System.out.println(property);

    }
}
