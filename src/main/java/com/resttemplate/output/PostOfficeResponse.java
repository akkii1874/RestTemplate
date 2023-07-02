package com.resttemplate.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PostOfficeResponse {

    @JsonProperty("Message")
    String message;
    @JsonProperty("Status")
    String Status;
    @JsonProperty("PostOffice")
    List<PostOffice> postOffices;
}
