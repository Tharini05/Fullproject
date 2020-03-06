package com.selenium.step_definition;

import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class LoginStep
{
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();



    @When("^I Click Account button$")
    public void i_Click_Account_button()
    {
        homePage.accountDetails();
    }

    @When("^Enter the Email address \"([^\"]*)\"$")
    public void enter_the_Email_address(String email)
    {
        loginPage.enterYourEmail(email);
    }

    @When("^Enter the password \"([^\"]*)\"$")
    public void enter_the_password(String pwd)
    {
        loginPage.enterYourPwd(pwd);
    }

    @Then("^Click sign in button$")
    public void click_sign_in_button()
    {
        loginPage.signIn();
    }

    @Then("^We should see the error messages \"([^\"]*)\"$")
    public void we_should_see_the_error_messages(String expected)
    {
        //String actual=loginPage.errorMessage();
        // assertThat(actual,is(expected));
    }


}
