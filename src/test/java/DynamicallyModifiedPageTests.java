
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import page_objects.DynamicallyModifiedPage;

public class DynamicallyModifiedPageTests extends BaseTests{

    private DynamicallyModifiedPage dynamicallyModifiedPage;

    @BeforeEach
    public void launchPage(){
        driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");
        dynamicallyModifiedPage = new DynamicallyModifiedPage(driver);
    }


    @Test
    public void elementExists(){
        assertTrue(dynamicallyModifiedPage.isElementPresent());
    }

    @Test
    public void removeElement(){
        dynamicallyModifiedPage.clickDeleteButton();
        assertFalse(dynamicallyModifiedPage.isElementPresent());
    }
    
}
