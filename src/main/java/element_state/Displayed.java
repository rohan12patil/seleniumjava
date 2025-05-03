package element_state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import setup.Init;
public class Displayed extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        // hidden element
        boolean isVisible = driver.findElement(By.name("my-hidden")).isDisplayed();
        
       driver.quit();
    }
}
