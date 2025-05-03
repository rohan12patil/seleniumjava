package interactions;
import setup.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploads extends Init{
     public static void main(String[] args){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");   

        String filePath = "/Users/rohan/Documents/dev/seleniumjava/resources/file.txt";

        WebElement uploadElement = driver.findElement(By.name("my-file"));
        uploadElement.sendKeys(filePath);
        
    }
}
