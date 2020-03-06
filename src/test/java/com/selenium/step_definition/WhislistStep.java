package com.selenium.step_definition;

import com.selenium.driver.DriverFactory;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.ResultPage;
import com.selenium.pages.WishListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhislistStep extends DriverFactory {

    HomePage homePage=new HomePage();
    ResultPage resultPage=new ResultPage();
    WishListPage wishListPage=new WishListPage();

    @When("^Select the product \"([^\"]*)\"$")
    public void selectTheProduct(String searchTerm)
    {
        sleep(1000);
        homePage.doSearch(searchTerm);
        resultPage.selectAnyProduct();
    }

    @And("^Click WishList$")
    public void clickWishList()
    {
        homePage.wishlistDetails();
    }

    @And("^Click home button$")
    public void clickHomeButton() {
        homePage.goToHome();
    }

    @And("^Select any product$")
    public void selectAnyProduct() {
        wishListPage.wishList();
    }
}
