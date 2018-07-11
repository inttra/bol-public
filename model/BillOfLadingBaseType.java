package com.inttra.mercury.billoflading.model;

public enum BillOfLadingBaseType {
    NEGOTIABLE("Negotiable"),
    NON_NEGOTIABLE("NonNegotiable");

    private final String value;

    BillOfLadingBaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillOfLadingBaseType fromValue(String v) {
        for (BillOfLadingBaseType c: BillOfLadingBaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
