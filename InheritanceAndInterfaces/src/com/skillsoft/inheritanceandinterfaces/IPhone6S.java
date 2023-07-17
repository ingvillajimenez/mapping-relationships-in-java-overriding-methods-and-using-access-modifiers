package com.skillsoft.inheritanceandinterfaces;

public class IPhone6S extends IPhone {
    public IPhone6S(float basePrice, boolean airpods) {
        super(basePrice, airpods);
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice() + getBasePrice() * 0.10;
    }
}
