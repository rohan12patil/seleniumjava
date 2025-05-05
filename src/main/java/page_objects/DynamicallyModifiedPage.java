package page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyModifiedPage {
    
    private final WebDriver driver;
    private final By element = By.id("element-to-remove");
    private final By deleteButton = By.id("buttonDelete");

    public DynamicallyModifiedPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
        new WebDriverWait(driver, Duration.ofMillis(5001))
        .until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    public boolean isElementPresent() {
        try {
            driver.findElement(element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
