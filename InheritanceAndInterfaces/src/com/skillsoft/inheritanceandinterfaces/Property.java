package com.skillsoft.inheritanceandinterfaces;

import java.util.Arrays;

public class Property {

    private final String propertyType;
    private final long id = Math.round(Math.random() * 100000);
//    private final long id;
    private final String projectName;
    private final int propertySize;

    private final String[] projectPartners;
    private int partnerIndex = 0;

//    {
//        id = Math.round(Math.random() * 100000);
//    }

    public Property(String propertyType, String projectName, int propertySize) {

//        this.id = Math.round(Math.random() * 100000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;

        projectPartners = new String[5];
    }

    public void addPartner(String partner) {
        projectPartners[partnerIndex++] = partner;
    }

    public void setProjectPartners(String[] partners) {
        this.projectPartners = partners;
    }

//    public void setPropertyType(String propertyType) {
//        this.propertyType = propertyType;
//    }

//    public void setId(long id) {
//        this.id = id;
//    }

//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }

//    public void setPropertySize(int propertySize) {
//        this.propertySize = propertySize;
//    }

    @Override
    public String toString() {
        return String.format(
                "\nProperty {propertyType=%s, id=%d, projectName=%s, propertySize=%s, \npartners=%s}",
                propertyType, id, projectName, propertySize,
                Arrays.toString(projectPartners));
    }
}
