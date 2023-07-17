package com.skillsoft.inheritanceandinterfaces;

public class Property {
//public final class Property {

    private final String propertyType;
    private final long id = Math.round(Math.random() * 100000);
    private final String projectName;
    private final int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    @Override
    public final String toString() {
        return String.format(
                "\nProperty {propertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }
}
