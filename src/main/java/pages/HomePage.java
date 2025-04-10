package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "signin2")
    private WebElement btnSignUpLocator;

    @FindBy(id = "sign-password")
    private WebElement inputPasswordLocator;

    public void clickSignUp() {
        getWait().until(ExpectedConditions.elementToBeClickable(btnSignUpLocator));
        btnSignUpLocator.click();
    }

    public boolean presentInputPassword() {
        getWait().until(ExpectedConditions.visibilityOf(inputPasswordLocator));
        return inputPasswordLocator.isDisplayed();
    }

}
