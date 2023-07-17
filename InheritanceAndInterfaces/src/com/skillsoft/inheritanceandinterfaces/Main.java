package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        ResidentialProperty alpha = new ResidentialProperty(
                "Alpha", 1200, ResidentialProperty.Type.TOWNHOME, 4000);
        ResidentialProperty beta = new ResidentialProperty(

                "Beta", 900, ResidentialProperty.Type.CONDO, 3000);

        alpha.printDetails();
        beta.printDetails();

        System.out.println();

        CommercialProperty gamma = new CommercialProperty(
                "Gamma", 3000, CommercialProperty.Type.OFFICE, 700);
        CommercialProperty delta = new CommercialProperty(
                "Delta", 10000, CommercialProperty.Type.RETAIL, 15000);

        gamma.printDetails();

        delta.printDetails();

        System.out.println();

        Property epsilon = new Property("Plot", "Epsilon", 1600);
        epsilon.printDetails();

        System.out.println();

    }
}