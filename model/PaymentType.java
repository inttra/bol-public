package com.inttra.mercury.billoflading.model;

import lombok.Getter;

public enum PaymentType {

    PREPAID("Prepaid"),
    COLLECT("Collect"),
    PAYABLEELSEWHERE("Payable elswhere");

    @Getter
    private String description;

    private PaymentType(String description) {
        this.description = description;
    }
}
