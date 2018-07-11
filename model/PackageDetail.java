package com.inttra.mercury.billoflading.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackageDetail {
    private int quantity;
    private PackageType packageTypeInformation;
    private WeightsAndVolumes packageMeasurements;
    private String hsCommodityCode;
    private ExportLicence exportLicense;
    private List<String> marks;
}
