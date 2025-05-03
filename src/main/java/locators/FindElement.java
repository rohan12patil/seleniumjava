package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Init;

public class FindElement extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement emailTextBox = driver.findElement(By.id("email"));
        emailTextBox.sendKeys("test@gmail.com");
       
        List<WebElement> radioButtons =  driver.findElements(By.cssSelector("input[type]='radio'"));
        System.out.println(radioButtons.size());
        // driver.quit();
    }
}
