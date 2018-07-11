package com.inttra.mercury.billoflading.model;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Charge {

    private String name;

    private String code;

    private double cost;

    private boolean isIncluded;

    private boolean isApplicable;

    @DynamoDBTypeConvertedEnum
    private CurrencyCodeType currencyCode;
}
