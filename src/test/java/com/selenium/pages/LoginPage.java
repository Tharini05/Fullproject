package com.selenium.pages;

import com.selenium.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverFactory
{
    @FindBy(css="input[id=\"email-address\"]")
    private WebElement emailName;

    @FindBy(css="input[id=\"current-password\"]")
    private WebElement pwdValue;

    @FindBy(css="button[data-bdd-test-id=\"yourEmailSubmitButton\"]")
    private WebElement signInButton;

    @FindBy(css="span[class=\"alert__message\"]")
    private WebElement errorMessageText;

    public void enterYourEmail(String email)
    {
        emailName.sendKeys(email);
    }
    public void enterYourPwd(String pwd)
    {
        pwdValue.sendKeys(pwd);
    }
    public void signIn()
    {
        signInButton.click();
    }
    public String errorMessage()
    {
        String errorMsg=errorMessageText.getText();
        return errorMsg;
    }
}
