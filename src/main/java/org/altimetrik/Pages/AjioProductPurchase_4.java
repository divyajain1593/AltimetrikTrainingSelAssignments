package org.altimetrik.Pages;

import org.altimetrik.Base.TestBase;
import org.altimetrik.utils.SeleniumUtil;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjioProductPurchase_4 extends TestBase {

    public AjioProductPurchase_4() {
        PageFactory.initElements(driver, this);
        driver.get("https://www.ajio.com/");
    }

    @FindBy(xpath = "//span[text()='Sign In / Join AJIO']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@name='otp']")
    public WebElement otpBox;

    @FindBy(xpath = "//input[@value='START SHOPPING']")
    public WebElement shopButton;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement signoutButton;

    @FindBy(xpath = "//input[@name='searchVal']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//span[@class='ic-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[text()=' Items Found']")
    public WebElement searchResult;

    @FindBy(xpath = "//div[@role='rowgroup']//div[1]")
    public WebElement firstSearchResult;

    @FindBy(xpath = "//span[text()='ADD TO BAG']")
    public WebElement addToBagButton;

    @FindBy(xpath = "//span[text()='GO TO BAG']")
    public WebElement goToBag;

    @FindBy(xpath = "//span[text()='item']")
    public WebElement itemInBag;


    public boolean isLoginSuccess() {
        signinButton.click();
        emailTextBox.sendKeys("testuser@gmail.com");
        continueButton.click();
        SeleniumUtil.dynamicWait(otpBox, driver);
        SeleniumUtil.wait(20);
        shopButton.click();
        SeleniumUtil.dynamicWait(signoutButton, driver);
        return signoutButton.isDisplayed();
    }

    public boolean isSearchProductPresent() {
        searchTextBox.sendKeys("curtain");
        searchButton.click();
        if (searchResult.getText().contains("Items Found"))
            return true;
        else
            return false;
    }

    public String addTOCart() {
        searchTextBox.sendKeys("curtain");
        searchButton.click();
        SeleniumUtil.dynamicWait(firstSearchResult, driver);
        firstSearchResult.click();
        SeleniumUtil.switchToChildWindow();
        SeleniumUtil.dynamicWait(addToBagButton, driver);
        addToBagButton.click();
        SeleniumUtil.dynamicWait(goToBag, driver);
        goToBag.click();
        SeleniumUtil.dynamicWait(itemInBag, driver);
        return itemInBag.getText();
    }


}

