package com.utils.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {

    public static String getDataFromPropertyFile(String filePath, String key) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Properties pro = new Properties();
        pro.load(fis);
        String value = pro.getProperty(key);
        return value;
    }

}
