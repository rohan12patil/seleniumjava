
package browser_interactions;
import setup.Init;

import org.openqa.selenium.By;

public class Navigation extends Init {
    public static void main(String[] args){
          driver.get("https://www.selenium.dev/selenium/web/clicks.html");
          System.out.println("On Page:: "+ driver.getTitle());

          driver.findElement(By.id("twoCLientRects")).click();
          System.out.println("Clicked link, now On Page:: "+ driver.getTitle());

          driver.navigate().back();
          System.out.println("Navigating back on Page:"+driver.getTitle());


          driver.navigate().forward();
          System.out.println("Went forward on Page:"+driver.getTitle());

          driver.quit();
         
    }
}