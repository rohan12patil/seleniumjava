package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.Init;

public class ExplicitWaits extends Init{
    public static void main(String[] args){

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        // click button to reveal the hidden input element
        driver.findElement(By.id("reveal")).click();

        // textbox 
        WebElement textbox = driver.findElement(By.id("revealed"));

        // explicit wait
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(textbox));
        // fill the hidden input element 
        textbox.sendKeys("Filling hidden input after waiting");
        // driver.quit();
    }
}
