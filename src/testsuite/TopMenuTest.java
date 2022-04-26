package testsuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Clicking on the computers tab on top menu
        clickOnElement(By.linkText("Computers"));

        //Validate expected and actual text 'Computers'
        verifyElements("Unable to navigate to categories: Computers","Computers",By.xpath("//h1[contains(text(),'Computers')]"));
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Clicking on the electronics tab on top menu
        clickOnElement(By.linkText("Electronics"));

        //Validate expected and actual text 'Electronics'
        verifyElements("Unable to navigate to categories: Electronics","Electronics",By.xpath("//h1[contains(text(),'Electronics')]"));
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Clicking on the apparel tab on top menu
        clickOnElement(By.linkText("Apparel"));

        //Validate expected and actual text 'Apparel'
        verifyElements("Unable to navigate to categories: Apparel","Apparel",By.xpath("//h1[contains(text(),'Apparel')]"));
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Clicking on the digital downloads tab on top menu
        clickOnElement(By.linkText("Digital downloads"));
        // This is from the given requirements

        //Validate expected and actual text 'Digital downloads'
        verifyElements("Unable to navigate to categories: Digital downloads","Digital downloads",By.xpath("//h1[contains(text(),'Digital downloads')]"));
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Clicking on the books tab on top menu
        clickOnElement(By.linkText("Books"));

        //Validate expected and actual text 'Books'
        verifyElements("Unable to navigate to categories: Books","Books",By.xpath("//h1[contains(text(),'Books')]"));
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // CLicking on the jewelry tab on top menu
        clickOnElement(By.linkText("Jewelry"));

        //Validate expected and actual text 'Jewelry'
        verifyElements("Unable to navigate to categories: Jewelry","Jewelry",By.xpath("//h1[contains(text(),'Jewelry')]"));
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // CLicking on the gift cards tab on top menu
        clickOnElement(By.linkText("Gift Cards"));

        //Validate expected and actual text 'Gift Cards'
        verifyElements("Unable to navigate to categories: Gift Cards","Gift Cards",By.xpath("//h1[contains(text(),'Gift Cards')]"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
