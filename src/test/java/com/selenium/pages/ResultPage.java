package com.selenium.pages;

import com.selenium.driver.DriverFactory;
import com.selenium.utills.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.fail;

public class ResultPage extends DriverFactory {

    public void selectAnyProduct()
    {
        List<WebElement> productWebElements=isProductAvailable();
        int productSize=productWebElements.size()-1;
        int randomNumber=new Helpers().randomNumberGenerator(productSize);
        WebElement selectedElement = productWebElements.get(randomNumber);
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class^=\"ProductCardstyles__WishlistIconContainer\"]")));
        selectedElement.findElement(By.cssSelector("div[class^=\"ProductCardstyles__WishlistIconContainer\"]")).click();
    }
    public List<WebElement> isProductAvailable()
    {
        List<WebElement> productWebElements = driver.findElements(By.cssSelector("div[data-test=\"component-product-card\"]"));
        if (productWebElements.size() == 0) {
            fail("No Products found");
        }
        return productWebElements;
    }

    public void selectAnyProductFromList()
    {
        List<WebElement> productWebElements=isProductAvailable();
        int productSize=productWebElements.size()-1;
        int randomNumber=new Helpers().randomNumberGenerator(productSize);
        WebElement selectedElement = productWebElements.get(randomNumber);
        selectedElement.click();
    }

    @FindBy(css=".filter-panel__inner")
    private List<WebElement> filterSelection;
    @FindBy(css=".findability-facet__header")
    private List<WebElement> overallHeader;
    public void overallFilter()
    {
        //String name="";
        for (WebElement fil:overallHeader)
        {
            String value=fil.getText();
            System.out.println("Value"+value);
        }
    }
    public void filterSelectionForAll(String filterOption)
    {
        String nameOfFilter="";
        for (WebElement selectedFilter:filterSelection)
        {
            nameOfFilter=selectedFilter.getText();
            if(nameOfFilter.equalsIgnoreCase(filterOption))
            {
                selectedFilter.click();
                break;
            }
        }
    }
}
