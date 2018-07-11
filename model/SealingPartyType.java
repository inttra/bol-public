package com.inttra.mercury.billoflading.model;

public enum SealingPartyType {

    CARRIER("Carrier"),

    CUSTOMS("Customs"),

    QUARANTINE_AGENCY("QuarantineAgency"),

    SHIPPER("Shipper"),

    TERMINAL_OPERATOR("TerminalOperator");
    private final String value;

    SealingPartyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SealingPartyType fromValue(String v) {
        for (SealingPartyType c: SealingPartyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
