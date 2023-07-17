package com.skillsoft.inheritanceandinterfaces;

public class OnePlus extends Phone {

    private boolean stylusSupport;

    public OnePlus(float basePrice, boolean stylusSupport) {
        super("Android", "OnePlus", basePrice);

        this.stylusSupport = stylusSupport;
    }

    @Override
    public String toString() {
        String superString = super.toString();

        return String.format("%s, stylusSupport: %s,", superString, stylusSupport);
    }
}
