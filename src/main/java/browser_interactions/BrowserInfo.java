
package browser_interactions;
import setup.Init;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserInfo extends Init {
    public static void main(String[] args){
          driver.get("https://www.selenium.dev/selenium/web/web-form.html");
          
          String title = driver.getTitle();
          String url = driver.getCurrentUrl();
          System.out.println(title);
          System.out.println(url);
    }
}