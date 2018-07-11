package com.inttra.mercury.billoflading.utilities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTypeConverter implements DynamoDBTypeConverter<String, LocalDate> {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

    @Override
    public String convert(LocalDate localDate) {
        return (localDate != null) ? dateTimeFormatter.format(localDate) : null;
    }

    @Override
    public LocalDate unconvert(String date) {
        return (date != null) ? LocalDate.parse(date, dateTimeFormatter) : null;
    }
}


