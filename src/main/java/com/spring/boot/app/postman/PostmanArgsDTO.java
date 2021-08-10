package com.spring.boot.app.postman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostmanArgsDTO {

    @JsonProperty(value = "foo1")
    private String foo1;

    @JsonProperty(value = "foo2")
    private String foo2;
}
