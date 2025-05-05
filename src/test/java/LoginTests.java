import static org.junit.jupiter.api.Assertions.assertEquals; // Use JUnit 5 Assertions

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import page_objects.LoginPage;

public class LoginTests extends BaseTests {

    private LoginPage loginPage;

    @BeforeEach
    public void loadPage(){
        driver.get("https://www.selenium.dev/selenium/web/login.html");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void successfulLoginTest() {
        String message = loginPage.login("username","password");
        assertEquals("You have successfully logged in.", message);
    }
    
}
