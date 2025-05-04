package browser_interactions;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import setup.Init;

public class TestAlertInNewTab extends Init {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
          
        driver.findElement(By.id("open-window-with-onload-alert")).click();

        Set<String> tabs = driver.getWindowHandles();
        String currentTab = driver.getWindowHandle();
        
        System.out.println(">>>> currentTab: "+driver.getTitle());

        for(String tab : tabs){
            driver.switchTo().window(tab);
            if(!currentTab.equals(driver.getWindowHandle())){
                break;
            }
        }

        Alert alert = driver.switchTo().alert();
        System.out.println(">>>> ALERT INFO: "+alert.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}