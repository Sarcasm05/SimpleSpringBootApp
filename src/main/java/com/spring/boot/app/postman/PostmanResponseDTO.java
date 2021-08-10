package com.spring.boot.app.postman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostmanResponseDTO {

    @JsonProperty(value = "url")
    private String panelCode;

    @JsonProperty(value = "args")
    private PostmanArgsDTO args;

    @JsonProperty(value = "headers")
    private PostmanHeadersDTO headers;
}
