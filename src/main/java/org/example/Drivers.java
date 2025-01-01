package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {
    public static WebDriver start() {
        String chromeDriver = "/home/smileowsky/Sənədlər/chromedriver-linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        ChromeOptions optionChrome = new ChromeOptions();
        optionChrome.addArguments("--start-maximized");

        //Create webdriver object and open google.com
        WebDriver driver = new ChromeDriver(optionChrome);
        return driver;
    }
}
