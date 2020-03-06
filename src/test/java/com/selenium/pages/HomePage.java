package com.selenium.pages;

import com.selenium.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverFactory
{
    @FindBy(css = "input[data-test='search-input']")
    WebElement searchBox;

    @FindBy(css="._3-aaF img[data-test=\"component-image\"]")
    WebElement homeLogo;

    @FindBy(css="a[data-test=\"account\"]")
    WebElement accountLogo;

    @FindBy(css="a[data-test=\"wishlist\"]")
    WebElement wishlistLogo;

    @FindBy(css="a[data-test=\"trolley\"]")
    WebElement trolleyLogo;

    public void doSearch(String item) {
        searchBox.clear();
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }
    public String getCurrentUrl()
    {
        return driver.getCurrentUrl();
    }

    public void goToHome()
    {
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-test=\"account\"]")));
        homeLogo.click();
    }

    public void accountDetails()
    {
        accountLogo.click();
    }

    public void wishlistDetails()
    {
       new WebDriverWait(driver,10)
       .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-test=\"wishlist\"]")));
        wishlistLogo.click();
    }
    public void trolleyDetails()
    {
        trolleyLogo.click();
    }
}
