
package browser_interactions;
import setup.Init;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Init {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        // click to open alert
        driver.findElement(By.id("alert")).click();
        // switch control from browser driver to alert window
        Alert alert = driver.switchTo().alert();
        // read alert message;
        String message = alert.getText();

        Thread.sleep(1500);
        // click on alert ok button
        alert.accept();
        driver.quit();
    }
}