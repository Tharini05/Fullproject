package com.selenium.step_definition;

import com.selenium.pages.HomePage;
import com.selenium.pages.ResultPage;
import com.selenium.pages.TrolleyPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class CommonStep
{
    HomePage homePage=new HomePage();
    ResultPage resultPage=new ResultPage();
    TrolleyPage trolleyPage=new TrolleyPage();

    @Given("^I am in home page$")
    public void i_am_in_home_page()
    {
        String actual=homePage.getCurrentUrl();
        assertThat(actual,endsWith(".co.uk/"));
    }

    @When("^Select the product name \"([^\"]*)\"$")
    public void selectTheProductName(String searchTerm)
    {
        homePage.doSearch(searchTerm);
    }

    @And("^Select any product from list$")
    public void selectAnyProductFromList()
    {
        resultPage.selectAnyProductFromList();

    }


}
