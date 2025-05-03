package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import setup.Init;

public class ImplicitWait extends Init{
    public static void main(String[] args){

        // Implicit wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        // click button to reveal the hidden input element
        driver.findElement(By.id("reveal")).click();
        // fill the hidden input element 
        driver.findElement(By.id("revealed")).sendKeys("Filling hidden input");
        
        driver.quit();
       
    }
}
