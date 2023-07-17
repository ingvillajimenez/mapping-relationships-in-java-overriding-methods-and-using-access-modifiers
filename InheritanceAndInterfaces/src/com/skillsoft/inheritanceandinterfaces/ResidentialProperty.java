package com.skillsoft.inheritanceandinterfaces;

public class ResidentialProperty extends Property {

    public ResidentialProperty(String projectName, int propertySize) {
        super("Residential Property", projectName, propertySize);
    }

    @Override
    public String toString() {
        return "Residential property!";
    }
}
