package element_state;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;


import setup.Init;
public class TestDetectVisibilty extends Init{
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.html");
        
        WebElement box = driver.findElement(By.id("box"));

        if(box.isDisplayed()){
            box.click();
        }else{
            System.out.println("box is not visible");
        }
        
      driver.quit();
       
    }
}