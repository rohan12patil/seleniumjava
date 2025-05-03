
package browser_interactions;
import setup.Init;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts extends Init {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
       
       // simpleAlerts();
       prompts();
       // waits();

        Thread.sleep(1500);
        driver.quit();
    }

    public static void simpleAlerts() throws InterruptedException{
         // click to open alert
        driver.findElement(By.id("alert")).click();
        // switch control from browser driver to alert window
        Alert alert = driver.switchTo().alert();
        // read alert message;
        String message = alert.getText();

        Thread.sleep(1500);
        // click on alert ok button
        alert.accept();
    }

    public static void comfirmations(){
        // other alert 
        driver.findElement(By.id("confirm")).click();
        Alert confirmation = driver.switchTo().alert();
        confirmation.accept();
        // confirmation.dismiss();
    }


    public static void prompts() throws InterruptedException{
        driver.findElement(By.id("prompt")).click();
         Alert prompt = driver.switchTo().alert();
         prompt.sendKeys("add to prompt text");
         Thread.sleep(1500);
         prompt.accept();
    }


    public static void waits() throws InterruptedException{
        driver.findElement(By.id("slow-alert")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(1500);
        alert.accept();
    }

}