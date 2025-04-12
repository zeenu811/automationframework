package com.utils.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {
    WebDriver driver;
    Actions act;

    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);
    }

    public void launchUrl(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void hover(WebElement element) {
        act.moveToElement(element).build().perform();
    }

    public void actionClick(WebElement element) {
        act.click(element).build().perform();
    }

    public void selectDropdownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectDropdownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropdownByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void enterValues(WebElement element, String value) {
        element.sendKeys(value);
    }
}
