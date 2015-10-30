package com.sentenial.rest.client.api.utils;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class TestUtils {

    public static String readFromRawResourceFile(String filename){
        try {
            return IOUtils.toString(TestUtils.class.getResourceAsStream(filename), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
