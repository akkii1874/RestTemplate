package com.resttemplate.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostOffice {

    @JsonProperty("Name")
    String name;
    @JsonProperty("Description")
    String description;
    @JsonProperty("BranchType")
    String branchType;
    @JsonProperty("DeliveryStatus")
    String deliveryStatus;
    @JsonProperty("circle")
    String Circle;
    @JsonProperty("District")
    String district;
    @JsonProperty("Division")
    String division;
    @JsonProperty("region")
    String Region;
    @JsonProperty("State")
    String state;
    @JsonProperty("Country")
    String country;
    @JsonProperty("Pincode")
    String pincode;

}