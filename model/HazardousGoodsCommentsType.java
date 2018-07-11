package com.inttra.mercury.billoflading.model;

public enum HazardousGoodsCommentsType {


    GENERAL("General"),

    HAZARDOUS_PLACKARD("HazardousPlackard"),

    PROPER_SHIPPING_NAME("ProperShippingName");
    private final String value;

    HazardousGoodsCommentsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazardousGoodsCommentsType fromValue(String v) {
        for (HazardousGoodsCommentsType c: HazardousGoodsCommentsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
