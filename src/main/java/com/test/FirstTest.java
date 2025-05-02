package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;       
public class FirstTest {
    
    static protected WebDriver driver;
    static {
        chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver= new ChromeDriver(options);  
    }
    public static void main(String[] args) {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }   
}
