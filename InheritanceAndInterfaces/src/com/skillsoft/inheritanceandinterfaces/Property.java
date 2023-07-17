package com.skillsoft.inheritanceandinterfaces;

public class Property {

    protected String propertyType;

    private long id;
    private String projectName;
    private int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {

        this.id = Math.round(Math.random() * 100000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    protected String getPropertyType() {
        return propertyType;
    }

    protected long getId() {
        return id;
    }

    protected String getProjectName() {
        return projectName;
    }

    protected int getPropertySize() {
        return propertySize;
    }

    protected String getFormattedString() {
        return String.format("\nProperty {propertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }
}
