package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAYSELECT = "//select[contains(@id, \"day\")]";
    public static final String XPATH_MONTHSELECT = "//select[contains(@id, \"month\")]";
    public static final String XPATH_YEARSELECT = "//select[contains(@id, \"year\")]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAYSELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("6");

        selectCombo = driver.findElement(By.xpath(XPATH_MONTHSELECT));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("7");

        selectCombo = driver.findElement(By.xpath(XPATH_YEARSELECT));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("1993");
    }
}
