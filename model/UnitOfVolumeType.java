package com.inttra.mercury.billoflading.model;


public enum UnitOfVolumeType {

    CBM,
    CBF;

    public String value() {
        return name();
    }

    public static UnitOfVolumeType fromValue(String v) {
        return valueOf(v);
    }

}
