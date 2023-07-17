package com.skillsoft.inheritanceandinterfaces;

public class IndustrialProperty extends Property {

    public IndustrialProperty(String projectName, int propertySize) {
        super("Industrial Property", projectName, propertySize);
    }

    public void printDetails() {
        System.out.println(getFormattedString());
    }

//    public void printDetails() {
//        System.out.println(String.format(
//                "Property type: %s, Project name: %s, Property Size in sqft: %s",
//                propertyType, getProjectName(), getPropertySize()));
//    }
}
