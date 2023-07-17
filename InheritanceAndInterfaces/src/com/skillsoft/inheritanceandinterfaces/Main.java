package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty("Acme", 2400);
        CommercialProperty commercialProperty = new CommercialProperty("Bliss", 4000);

        System.out.println("Residential Property: " + residentialProperty);
        System.out.println("Commercial Property: " + commercialProperty);

    }
}