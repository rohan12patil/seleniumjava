package interactions;
import setup.Init;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        // Dropdown Select by name="my-select" 
        Select dropdown = new Select(driver.findElement(By.name("my-select")));

        // dropdown.selectByValue("2");
        dropdown.selectByVisibleText("Three");
        dropdown.selectByIndex(2);

        WebElement selectedOption = dropdown.getFirstSelectedOption();

        // For multiselected options
        // List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();


        // Deselection
        dropdown.deselectByIndex(2);
        dropdown.deselectByValue("2");

        
       // driver.quit();
    }
}
