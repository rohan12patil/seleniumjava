
package browser_interactions;
import setup.Init;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

public class Cookies extends Init {
    public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Cookie cookie = new Cookie("theme","light");

        driver.manage().addCookie(cookie);
        
        Cookie themeCookie = driver.manage().getCookieNamed("theme");
        System.out.println(themeCookie.getDomain());

        driver.manage().deleteCookie(themeCookie);

        System.out.println(driver.manage().getCookies().size());
        
    }
}