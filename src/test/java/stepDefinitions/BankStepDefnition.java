package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.BankPage;
import utils.TestContextSetup;

public class BankStepDefnition {
    
    public WebDriver driver;
    public BankPage bankPage;
    TestContextSetup testcontextsetup;

    public BankStepDefnition(TestContextSetup testcontextsetup) {
        this.testcontextsetup = testcontextsetup;
        bankPage = testcontextsetup.pageObjectmanager.getBankPage();
    }
    @Given("User Click on {string} in home page")
    public void user_click_on_something_in_home_page(String locator) {
        bankPage.clickable(locator).click();
    
    }
    
    @And("User enter {string} in {string}")
    public void user_enter_something_in_something(String value, String locator)  {
       bankPage.inputValue(locator).sendKeys(value);
    }
    
}

