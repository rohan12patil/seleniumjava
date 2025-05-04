package browser_interactions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.remote.RemoteWebElement;

import setup.Init;

public class Screenshots  extends Init {
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        BrowsingContext browsingContext = new BrowsingContext(driver, driver.getWindowHandle()); 
        
        // Full page
        String fullScreenshot = browsingContext.captureScreenshot();
        saveScreenshot(fullScreenshot, "webform_screenshot.png");
        

        // Element
        WebElement colorPicker = driver.findElement(By.name("my-colors"));
        String internalElementId = ((RemoteWebElement) colorPicker).getId();
        String elementScreenshot = browsingContext.captureElementScreenshot(internalElementId);
        saveScreenshot(elementScreenshot, "element_screenshot.png");

        //viewPort
        driver.findElement(By.name("my-date")).click();
        Rectangle datePicker = driver.findElement(By.className("datepicker")).getRect();
        String viewportScreenshot = browsingContext.captureBoxScreenshot(
            datePicker.getX(), 
            datePicker.getY(),
            datePicker.getWidth(),
            datePicker.getHeight()
            );
        saveScreenshot(viewportScreenshot, "viewport_screenshot.png");
        
        
        
        driver.quit();    


    }

    private static void saveScreenshot(String screenshot, String filename){
        byte[] decodedScreenshot = Base64.getDecoder().decode(screenshot);
        try {
            String path = "/Users/rohan/Documents/dev/seleniumjava/screenshots/";
            Files.write(Paths.get(path+filename), decodedScreenshot);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
