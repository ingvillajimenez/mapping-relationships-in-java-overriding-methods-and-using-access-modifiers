package com.skillsoft.inheritanceandinterfaces;

public abstract class IPhone extends Phone {

    private boolean airpods;

    public IPhone(float basePrice, boolean airpods) {
        super("iOS", "iPhone 6s", basePrice);

        this.airpods = airpods;
    }

//    @Override
//    public double computeTotalPrice() {
//        return getBasePrice() + getBasePrice() * 0.10;
//    }

    @Override
    public String toString() {
        String superString = super.toString();

        return String.format("%s, airpods: %s", superString, airpods);
    }
}
