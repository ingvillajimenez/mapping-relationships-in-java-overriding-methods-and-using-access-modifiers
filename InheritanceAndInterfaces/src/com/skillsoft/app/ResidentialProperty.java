package com.skillsoft.app;

import com.skillsoft.inheritanceandinterfaces.Property;

public class ResidentialProperty extends Property {

    public ResidentialProperty(String projectName, int propertySize) {
        super("Residential Property", projectName, propertySize);
    }

    public void printDetails() {
        System.out.println(String.format(
                "Property type: %s, Project name: %s, Property Size in sqft: %s",
                propertyType, getProjectName(), getPropertySize()));
    }
}
