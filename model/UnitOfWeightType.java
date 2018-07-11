package com.inttra.mercury.billoflading.model;


public enum UnitOfWeightType {

    KGS,
    LBS;

    public String value() {
        return name();
    }

    public static UnitOfWeightType fromValue(String v) {
        return valueOf(v);
    }

}
