package testsuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find register link element and click on register link
        clickOnElement(By.linkText("Register"));

        //Validate expected and actual message
        verifyElements("Navigation to register page unsuccessful","Register",By.xpath("//h1[contains(text(),'Register')]"));
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Find register link element and click on register link
        clickOnElement(By.linkText("Register"));

        // Finding the gender element by clicking on radio button
        clickOnElement(By.xpath("//input[@id='gender-male']"));

        // Finding the first name element
        sendTextToElement(By.name("FirstName"),"Raymond");
        // Finding the last name element
        sendTextToElement(By.name("LastName"),"Ray");
        // Finding the date of birth field element
       selectByValueFromDropDown(By.name("DateOfBirthDay"),"17");
        // Finding the month of birth field element
        selectByVisibleTextFromDropDown(By.name("DateOfBirthMonth"),"April");
        // Finding the year of birth field element
        selectByValueFromDropDown(By.name("DateOfBirthYear"),"1980");

        // Finding the email field element
        sendTextToElement(By.id("Email"),"alpha789@gmail.com");
        // Finding the password field element
        sendTextToElement(By.name("Password"),"Abc8909");
        // Finding the confirm password field element
        sendTextToElement(By.name("ConfirmPassword"),"Abc8909");

        // Finding the register button and clicking on it
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //Validate expected and actual message
        verifyElements("Registration not successful","Your registration completed",By.xpath("//div[contains(text(),'Your registration completed')]"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
