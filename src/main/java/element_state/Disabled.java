package element_state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import setup.Init;
public class Disabled extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        boolean isEnabled = driver.findElement(By.name("my-disabled")).isEnabled();
        
        driver.quit();
       
    }
}
