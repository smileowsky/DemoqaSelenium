package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriver = "/home/smileowsky/Sənədlər/chromedriver-linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        ChromeOptions optionChrome = new ChromeOptions();
        optionChrome.addArguments("--start-maximized");

        //Create webdriver object and open google.com
        WebDriver driver = new ChromeDriver(optionChrome);
        driver.get("https://www.google.com/");

        //Enter search keyword
        driver.findElement(By.id("APjFqb")).sendKeys("demoqa");

        //Click ENTER button
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys(Keys.RETURN);


        driver.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div/div[2]/div[2]/div/div/div[1]/div" +
                "/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();


        //Click Elements
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]")).click();

        //Click Text Box
        driver.findElement(By.id("item-0")).click();

        //Fill up fields
        driver.findElement(By.id("userName")).sendKeys("Khayal Gulush");
        driver.findElement(By.id("userEmail")).sendKeys("gulushovxeyal@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Azerbaijan, Baku, Khatai district, Tagizadeh street home 11/15 house 2");
        driver.findElement(By.id("permanentAddress")).sendKeys("Azerbaijan, Baku, Khatai district, Tagizadeh street home 11/15 house 2");

        //Click Submit
        driver.findElement(By.id("submit")).click();

        //Wait
        Thread.sleep(10000);

        //Close
        driver.quit();
    }
}