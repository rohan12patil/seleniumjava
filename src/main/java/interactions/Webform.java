package interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.Init;
public class Webform  extends Init{
     public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        // enter text into username input of type text 
        driver.findElement(By.id("my-text-id")).sendKeys("username");

        // enter text into password 
        driver.findElement(By.name("my-password")).sendKeys("password");

        // enter text into textarea
        driver.findElement(By.name("my-textarea")).sendKeys("Selenium is awesome automation framework ");

        // select from dropdown
        new Select(driver.findElement(By.name("my-select"))).selectByValue("3");
        
        // deselect checkbox
        WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
        if(checkbox1.isSelected()){
            checkbox1.click();
        }

        // Radio Buttons
        driver.findElement(By.id("my-radio-2")).click();
        Thread.sleep(7000);
        // submit form 
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(5000);
        driver.quit();

    }
}
