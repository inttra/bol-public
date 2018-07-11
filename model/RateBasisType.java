package com.inttra.mercury.billoflading.model;

public enum RateBasisType {
    CONTAINER("Per Container"),
    DOCUMENT("Per Document");


    private String description;

    private RateBasisType(String description) {
        this.description = description;
    }

}
