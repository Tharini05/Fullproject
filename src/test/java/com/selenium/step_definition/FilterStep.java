package com.selenium.step_definition;

import com.selenium.driver.DriverFactory;
import com.selenium.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FilterStep extends DriverFactory
{
    ResultPage resultPage=new ResultPage();
    @And("^I need to apply filter techniques \"([^\"]*)\"$")
    public void iNeedToApplyFilterTechniques(String arg0)
    {
        //resultPage.filterSelectionForAll(arg0);
        resultPage.overallFilter();
    }

    @Then("^I should be able to see the products for \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheProductsFor(String arg0)
    {

    }
}
