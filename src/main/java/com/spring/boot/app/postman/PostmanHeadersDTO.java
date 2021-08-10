package com.spring.boot.app.postman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostmanHeadersDTO {

    @JsonProperty(value = "x-forwarded-proto")
    private String xForwardedProto;

    @JsonProperty(value = "host")
    private String host;

    @JsonProperty(value = "accept")
    private String accept;

    @JsonProperty(value = "accept-encoding")
    private String acceptEncoding;

    @JsonProperty(value = "cache-control")
    private String cacheControl;

    @JsonProperty(value = "cookie")
    private String cookie;

    @JsonProperty(value = "my-saple-header")
    private String mySampleHeader;

    @JsonProperty(value = "postman-token")
    private String postmanToken;

    @JsonProperty(value = "user-agent")
    private String userAgent;

    @JsonProperty(value = "x-forwarded-port")
    private String xForwardedPort;
}
