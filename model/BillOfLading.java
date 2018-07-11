package com.inttra.mercury.billoflading.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.inttra.mercury.dynamo.respository.id.DynamoHashKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "billoflading")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillOfLading implements DynamoHashKey<String> {
    @JsonProperty(value="uniqueId")
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String hashKey;

    private GeneralInformation headerInformation;
    private ContractOfCarriage contractOfCarriage;
    private ReceiptOfGoods receiptOfGoods;
    private Title titleOfOwnership;
    private DocumentImage pdfImage;
    private Parties parties;
    @DynamoDBTypeConvertedEnum
    private BillOfLadingBaseType billOfLadingType;
}
