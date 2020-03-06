package com.selenium.pages;

import com.selenium.driver.DriverFactory;
import com.selenium.utills.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

public class WishListPage extends DriverFactory
{
    @FindBy(css="div[class=\"ac-product-card ac-product-card--full-width\"]")
    private List<WebElement> wishListValues;

public void wishList()
{
    List<WebElement> productsInWishList=wishListValues;
    if(productsInWishList.size()==0)
    {
        fail("No products in wishList");
    }
    sleep(1000);
    int productSize=productsInWishList.size();
    int randomNumber= new Helpers().randomNumberGenerator(productSize);
    WebElement productSelected=productsInWishList.get(randomNumber);
    new WebDriverWait(driver,10)
            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class=\"ac-product-cta__button ac-product-cta__button--trolley\"]")));
    productSelected.findElement(By.cssSelector("div[class=\"ac-product-cta__button ac-product-cta__button--trolley\"]")).click();
    }
}
