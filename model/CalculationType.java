package com.inttra.mercury.billoflading.model;

public enum CalculationType {
    UNITARY("Unitary"),
    PERCENTAGE("Percentage"),
    FIXED("Fixed"),
    TEU("TEU"),
    METRICTON("Metric_Ton");

    private String description;

    private CalculationType(String description) {
        this.description = description;
    }
}
