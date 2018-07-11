package com.inttra.mercury.billoflading.model;

public enum UnitOfTemperatureType {

    CEL,
    FAH;

    public String value() {
        return name();
    }

    public static UnitOfTemperatureType fromValue(String v) {
        return valueOf(v);
    }

}
