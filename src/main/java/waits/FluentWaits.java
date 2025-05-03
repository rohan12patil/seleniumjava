package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.Init;

public class FluentWaits  extends Init{
    public static void main(String[] args){

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        // click button to reveal the hidden box 
        driver.findElement(By.id("adder")).click();

         Wait<WebDriver> wait = new FluentWait<>(driver)
         .withTimeout(Duration.ofSeconds(5))
         .pollingEvery(Duration.ofMillis(200))
         //.ignoring(NoSuchElementException.class);
         .ignoring(NoSuchElementException.class,NoSuchFieldError.class);


        WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));
        if(box.isDisplayed()){
            System.out.println(">>>>>>>>>>>>>> Box is visible after fluent waiting ");
        }else{
            System.out.println("Box not visible");
        }

        // driver.quit();
    }
}