package com.spring.boot.app.utils;

public interface ClientUtils {
    public <T> T getdata(Class<T> classType, String url);
}
