package com.test;

import com.filepath.PropertiesFilePath;
import com.utils.com.FileUtils;

import java.io.IOException;

public class FileUtilTest {

    public static void main(String[] args) throws IOException {
        String browserName = FileUtils.getDataFromPropertyFile(PropertiesFilePath.CONFIGDATAPATH, "url");
        System.out.println(browserName);
    }
}
