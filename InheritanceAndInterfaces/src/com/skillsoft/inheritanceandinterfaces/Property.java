package com.skillsoft.inheritanceandinterfaces;

public class Property {

    String propertyType;

    private long id;
    private String projectName;
    private int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {

        this.id = Math.round(Math.random() * 100000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    String getPropertyType() {
        return propertyType;
    }

    long getId() {
        return id;
    }

    String getProjectName() {
        return projectName;
    }

    int getPropertySize() {
        return propertySize;
    }

    String getFormattedString() {
        return String.format("\nProperty {propertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }
}
