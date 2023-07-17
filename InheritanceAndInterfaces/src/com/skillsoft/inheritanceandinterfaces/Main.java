package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Property alpha = new Property("Residential Property",
                "Alpha", 1200);

        alpha.addPartner("Sangath Builders");
        alpha.addPartner("Maxim and Co. Builders");

        System.out.println("alpha: " + alpha);
//        Property beta = new Property("Commercial Property",
//                "Beta", 3000);
//        Property gamma = new Property("Industrial Property",
//                "Gamma", 1000000);
//        Property delta = new Property("Plot",
//                "delta", 1600);

//        System.out.println("alpha: " + alpha);
//        System.out.println("beta: " + beta);
//        System.out.println("gamma: " + gamma);
//        System.out.println("delta: " + delta);

//        alpha.setId(1000);
//        beta.setProjectName("Omega");
//        gamma.setPropertySize(2500);
//        delta.setPropertyType("Government Land");
//
//        System.out.println("\n*----**********************---*\n");

//        System.out.println("alpha (updated): " + alpha);
//        System.out.println("beta (updated): " + beta);
//        System.out.println("gamma (updated): " + gamma);
//        System.out.println("delta (updated): " + delta);

    }
}