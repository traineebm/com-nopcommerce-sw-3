package testsuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToLoginPageSuccessfully(){
        //Find login link element and click on login link
        clickOnElement(By.linkText("Log in"));

        //Validate expected and actual message
        verifyElements("Welcome message not matching","Welcome, Please Sign In!",By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find login link element and click on login link
        clickOnElement(By.linkText("Log in"));
        // Finding the email field element
        sendTextToElement(By.id("Email"),"alpha789@gmail.com");
        // Finding the password field element
        sendTextToElement(By.name("Password"),"Abc8909");
        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//button[normalize-space()='Log in']"));

        //Validate expected and actual text message
        verifyElements("Log out text message is not matching","Log out",By.xpath("//a[contains(text(),'Log out')]"));

    }

    @Test
    public void verifyTheErrorMessage(){
        //Finding login link element and clicking on login link
        clickOnElement(By.linkText("Log in"));

        // Finding the email field element
        sendTextToElement(By.id("Email"),"raymond23@gmail.com");
        // Finding the password field element
        sendTextToElement(By.name("Password"),"alfaRo123");
        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//button[normalize-space()='Log in']"));

        //Verifying the text from the given requirements
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors]"));
        //Validate expected and actual message
        Assert.assertEquals("Error message displayed", expectedErrorMessage,actualErrorMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
