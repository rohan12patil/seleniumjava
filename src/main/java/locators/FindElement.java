package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Init;

public class FindElement extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement emailTextBox = driver.findElement(By.id("email"));
        emailTextBox.sendKeys("test@gmail.com");
        // driver.quit();
    }
}
