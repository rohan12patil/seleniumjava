package interactions;
import setup.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Textbox extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement textbox = driver.findElement(By.name("id-name1"));
        textbox.getText();
        textbox.clear();
        textbox.sendKeys("Tony Stark");
    }
}
