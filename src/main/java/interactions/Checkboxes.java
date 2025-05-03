package interactions;
import setup.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkboxes extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");   

        // checkbox with id my-check-1
        WebElement checkbox = driver.findElement(By.id("my-check-1"));
        boolean isSelected = checkbox.isSelected();
        if(isSelected){
            checkbox.click();
        }
    }
}
