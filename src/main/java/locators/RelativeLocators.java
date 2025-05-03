package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import setup.Init;


public class RelativeLocators extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");
        
        WebElement bottomButton = driver.findElement(RelativeLocator.with(By.id("submit")).below(By.id("submit")));
        bottomButton.isDisplayed();
    }
}