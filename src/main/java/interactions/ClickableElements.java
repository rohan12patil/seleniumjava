package interactions;
import setup.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClickableElements extends Init{
     public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // Submit Button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        // link with text 'Return to index'
        driver.findElement(By.xpath("//a[normalize-space(text())='Return to index']")).click();
        
    }
}


