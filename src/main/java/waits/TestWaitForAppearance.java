
package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.Init;

public class TestWaitForAppearance extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");
       
        // get elementToRemove
        WebElement elementToRemove = driver.findElement(By.id("element-to-remove"));

        // click on delete button
        driver.findElement(By.id("buttonDelete")).click();

        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofMillis(5001));
        
        boolean removed = wait.until(ExpectedConditions.invisibilityOf(elementToRemove));

        System.out.println(removed);


        //driver.quit();
       
    }
}
