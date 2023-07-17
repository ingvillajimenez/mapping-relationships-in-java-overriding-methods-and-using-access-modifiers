package com.skillsoft.inheritanceandinterfaces;

public class CommercialProperty extends Property{

    public CommercialProperty(String projectName, int propertySize) {
        super("Commercial Property", projectName, propertySize);
    }

    @Override
    public String toString() {
        return "Commercial property!";
    }
}
