package com.spring.boot.app.postman;

import com.spring.boot.app.utils.ClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostmanServiceImpl implements PostmanService{
    private static final String POSTMAN_URL = "https://postman-echo.com/get?foo1=";
    private static final String POSTMAN_URL_SECOND_PART = "&foo2=";

    private final ClientUtils clientUtils;

    @Autowired
    public PostmanServiceImpl(ClientUtils clientUtils){
        this.clientUtils = clientUtils;
    }

    @Override
    public PostmanResponseDTO getResponseFromPostman(String foo1, String foo2) {
        String url = POSTMAN_URL + foo1 + POSTMAN_URL_SECOND_PART + foo2;
        return clientUtils.getdata(PostmanResponseDTO.class, url);
    }
}
