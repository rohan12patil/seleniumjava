package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Init {
    protected static WebDriver driver;
    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver= new ChromeDriver(options);  
    }
    // public static void main(String[] args) {
    //     driver.get("https://www.google.com");
    //     System.out.println(driver.getTitle());
    //     driver.quit();
    // }   
}
