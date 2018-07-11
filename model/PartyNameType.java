package com.inttra.mercury.billoflading.model;


public enum PartyNameType {

    SHIPPER("Shipper"),

    CONSIGNEE("Consignee"),

    CARRIER("Carrier"),

    NOTIFY_PARTY("NotifyParty"),

    CARRIER_AGENT("CarrierAgent"),

    FORWARDING_AGENT("ForwardingAgent");
    private final String value;

    PartyNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartyNameType fromValue(String v) {
        for (PartyNameType c: PartyNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
