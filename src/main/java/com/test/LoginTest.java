package com.test;

import com.filepath.PropertiesFilePath;
import com.utils.com.FileUtils;
import com.utils.com.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class LoginTest {

    public static WebDriver driver = new ChromeDriver();
    public static WebDriverUtils utils = new WebDriverUtils(driver);

    public static void main(String[] args) throws IOException {
        String url = "https://www.facebook.com";
        utils.launchUrl(url);

        WebElement createButton = driver.findElement(By.linkText("Create new account"));
        utils.clickElement(createButton);

        WebElement firstNameTextField = driver.findElement(By.name("firstname"));
        utils.enterValues(firstNameTextField, "zeeshan");

        WebElement lastNameTextField = driver.findElement(By.name("lastname"));
        utils.enterValues(lastNameTextField, "siddique");

    }


}
