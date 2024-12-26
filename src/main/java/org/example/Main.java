package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriver = "/home/smileowsky/Sənədlər/chromedriver-linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        ChromeOptions optionChrome = new ChromeOptions();
        optionChrome.addArguments("--start-maximized");

        //Create webdriver object and open google.com
        WebDriver driver = new ChromeDriver(optionChrome);
        driver.get("https://demoqa.com/");

        //Enter search keyword
        //driver.findElement(By.id("APjFqb")).sendKeys("demoqa");

        //Click ENTER button
        //WebElement input = driver.findElement(By.name("q"));
        //input.sendKeys(Keys.RETURN);
        //Thread.sleep(3000);


        driver.findElement(By.xpath("//html/body/div[2]/div/div/div[2]/div/div[1]/div")).click();
        Thread.sleep(3000);

        //Click Elements
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]")).click();

        //Click Text Box
        driver.findElement(By.id("item-0")).click();

        //Fill up fields
        driver.findElement(By.id("userName")).sendKeys("Khayal Gulush");
        driver.findElement(By.id("userEmail")).sendKeys("gulushovxeyal@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Azerbaijan, Baku, Khatai district, Tagizadeh street home 11/15 house 2");
        driver.findElement(By.id("permanentAddress")).sendKeys("Azerbaijan, Baku, Khatai district, Tagizadeh street home 11/15 house 2");
        Thread.sleep(3000);

        //Scroll to footer
        WebElement footer = driver.findElement(By.tagName("footer"));
        int deltaY = footer.getRect().y;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();

        //Click Submit
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);

        //Scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");

        //Click ChecBox
        driver.findElement(By.id("item-1")).click();

        //Click Plus
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div/button[1]")).click();

        //Click checkbox
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/span/label/span[1]")).click();

        //Click Radio Button
        driver.findElement(By.id("item-2")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]")).click();

        //Click Web Tables
        driver.findElement(By.id("item-3")).click();
        driver.findElement(By.id("edit-record-1")).click();

        //First Name input
        WebElement firstName_input = driver.findElement(By.id("firstName"));
        firstName_input.clear();
        driver.findElement(By.id("firstName")).sendKeys("Khayal");

        //Last Name input
        WebElement lastName_input = driver.findElement(By.id("lastName"));
        lastName_input.clear();
        driver.findElement(By.id("lastName")).sendKeys("Gulushov");

        //Email input
        WebElement userEmail_input = driver.findElement(By.id("userEmail"));
        userEmail_input.clear();
        driver.findElement(By.id("userEmail")).sendKeys("smileowsky@gmail.com");

        //Age input
        WebElement age_input = driver.findElement(By.id("age"));
        age_input.clear();
        driver.findElement(By.id("age")).sendKeys("30");

        //Salary input
        WebElement salary_input = driver.findElement(By.id("salary"));
        salary_input.clear();
        driver.findElement(By.id("salary")).sendKeys("3500");

        //Department input
        WebElement department_input = driver.findElement(By.id("department"));
        department_input.clear();
        driver.findElement(By.id("department")).sendKeys("Testing");

        //Wait
        Thread.sleep(10000);

        //Close
        driver.quit();
    }
}