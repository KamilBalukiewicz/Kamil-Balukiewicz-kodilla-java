package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_FIRST_NAME = "//div[contains(@class, \"PlaceholderInput\")]/input";
    public static final String XPATH_LAST_NAME = "//div[contains(@class, \"rfloat\")]/div/div/input";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_SELECT_SEX = "//div[contains(@class, \"_5wa2\")]/span/span[2]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRST_NAME));
        firstnameField.sendKeys("Joe");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LAST_NAME));
        lastnameField.sendKeys("Doe");

        WebElement daySelectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(daySelectCombo);
        selectDay.selectByIndex(6);

        WebElement monthSelectCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthSelectCombo);
        selectMonth.selectByIndex(9);

        WebElement yearSelectCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearSelectCombo);
        selectYear.selectByIndex(31);

        WebElement sexSelectField = driver.findElement(By.xpath(XPATH_SELECT_SEX));
        sexSelectField.click();
    }
}
