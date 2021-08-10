package com.spring.boot.app.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientUtilsImpl implements ClientUtils {

    private final RestTemplate restTemplate;

    @Autowired
    public ClientUtilsImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public <T> T getdata(Class<T> classType, String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<T> response = null;
        response = restTemplate.getForEntity(url, classType);

        return response == null ? null : response.getBody();
    }
}
