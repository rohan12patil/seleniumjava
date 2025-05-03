
package browser_interactions;
import setup.Init;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iframe extends Init {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/selenium/web/click_tests/click_in_iframe.html");

        // switch to iframe 
        driver.switchTo().frame("ifr");
        driver.findElement(By.id("link")).click();


        // switching bank to page 
         // driver.switchTo().defaultContent();

        Thread.sleep(1500);
        driver.quit();
    }
}