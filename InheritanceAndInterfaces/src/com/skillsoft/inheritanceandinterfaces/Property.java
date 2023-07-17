package com.skillsoft.inheritanceandinterfaces;

public class Property {

    public String propertyType;

    private long id;
    private String projectName;
    private int propertySize;

    private Property(String propertyType, String projectName, int propertySize) {

        this.id = Math.round(Math.random() * 100000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    public static Property getPropertyInstance(String propertyType, String projectName, int propertySizeInSqft) {
        return new Property(propertyType, projectName, propertySizeInSqft);
    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    private String getFormattedString() {
        return String.format("\nProperty {propertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }
}
