package com.inttra.mercury.billoflading.model;

public enum PackingGroupCode {
    MINOR_DANGER("MinorDanger"),
    MEDIUM_DANGER("MediumDanger"),
    GREAT_DANGER("GreatDanger");

    private final String value;

    PackingGroupCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackingGroupCode fromValue(String v) {
        for (PackingGroupCode c: PackingGroupCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
