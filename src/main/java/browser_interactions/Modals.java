
package browser_interactions;
import setup.Init;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Modals extends Init {
    public static void main(String[] args) throws InterruptedException{
          driver.get("https://www.selenium.dev/selenium/web/modal_dialogs/modern_modal.html");
          // btn to open modal
          driver.findElement(By.id("trigger-modal-btn")).click();

          WebElement modal = driver.findElement(By.id("modalContent"));
          if(modal.isDisplayed()){
            System.out.println("Modal is displayed");
            driver.findElement(By.id("modal-input")).sendKeys("Hi Modal ");
            
            Thread.sleep(2500);
            driver.findElement(By.id("modal-close")).click();
          }else{
            System.out.println("Modal is not displayed");
          }
        
          Thread.sleep(1000);
          driver.quit();
        
    }
}