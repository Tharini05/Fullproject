package com.selenium.step_definition;

import com.selenium.driver.DriverFactory;
import com.selenium.pages.HomePage;
import com.selenium.pages.ResultPage;
import com.selenium.pages.TrolleyPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TrolleyStep extends DriverFactory
{
    HomePage homePage=new HomePage();
    ResultPage resultPage=new ResultPage();
    TrolleyPage trolleyPage=new TrolleyPage();

    @When("^Go to trolley$")
    public void goToTrolley()
    {
        trolleyPage.addToTrolley();
        trolleyPage.goToContinueShopping();
    }

    @And("^check the sub total$")
    public void checkTheSubTotal()
    {
        double actualResult=trolleyPage.getActualResult();
        double expectedResult=trolleyPage.expectedResultContinue();
        assertThat(actualResult,is(equalTo(expectedResult)));
    }

    @Then("^Click Trolley Logo$")
    public void clickTrolleyLogo()
    {
        homePage.trolleyDetails();
    }
}
