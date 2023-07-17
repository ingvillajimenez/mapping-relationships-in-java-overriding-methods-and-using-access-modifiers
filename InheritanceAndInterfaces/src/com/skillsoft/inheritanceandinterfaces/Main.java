package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Property alpha = new ResidentialProperty(
                "Alpha", 1200, ResidentialProperty.Type.TOWNHOME, 4000);
        Property beta = new ResidentialProperty(
                "Beta", 900, ResidentialProperty.Type.CONDO, 3000);

        System.out.println(alpha);
        System.out.println(beta);

        System.out.println();

//        ResidentialProperty alpha = new ResidentialProperty(
//                "Alpha", 1200, ResidentialProperty.Type.TOWNHOME, 4000);
//        ResidentialProperty beta = new ResidentialProperty(
//
//                "Beta", 900, ResidentialProperty.Type.CONDO, 3000);
//
//        System.out.println(alpha);
//
//        System.out.println(beta);
//
//        System.out.println();

        Property gamma = new CommercialProperty(
                "Gamma", 3000, CommercialProperty.Type.OFFICE, 7000);
        Property delta = new CommercialProperty(
                "Delta", 10000, CommercialProperty.Type.RETAIL, 15000);

        System.out.println(gamma);
        System.out.println(delta);

        System.out.println();

//        CommercialProperty gamma = new CommercialProperty(
//                "Gamma", 3000, CommercialProperty.Type.OFFICE, 7000);
//        CommercialProperty delta = new CommercialProperty(
//                "Delta", 10000, CommercialProperty.Type.RETAIL, 15000);
//
//        System.out.println(gamma);
//        System.out.println(delta);
//
//        System.out.println();

        Property epsilon = new Property("Plot", "Epsilon", 1600);
        System.out.println(epsilon);

        System.out.println();
    }
}