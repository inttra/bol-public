package com.inttra.mercury.billoflading.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.inttra.mercury.billoflading.utilities.LocalDateTypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExportLicence {
    private String exportLicenseNumber;
    @DynamoDBTypeConverted(converter = LocalDateTypeConverter.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate issueDate;
    @DynamoDBTypeConverted(converter = LocalDateTypeConverter.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;
}
