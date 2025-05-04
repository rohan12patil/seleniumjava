package browser_interactions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;

import setup.Init;

public class Screenshots  extends Init {
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        BrowsingContext browsingContext = new BrowsingContext(driver, driver.getWindowHandle()); 
        
        // Full page
        String fullScreenshot = browsingContext.captureScreenshot();
        saveScreenshot(fullScreenshot, "webform_screenshot.png");
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
