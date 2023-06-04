package org.altimetrik.Pages;

import org.altimetrik.Base.TestBase;
import org.altimetrik.utils.SeleniumUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearch_1 extends TestBase {

    public GoogleSearch_1() {
        PageFactory.initElements(driver, this);
        driver.get("https://www.google.com/");
    }

    @FindBy(xpath = "//textarea[@id='APjFqb' or @type='search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//div[@class='erkvQe']/div[@class='OBMEnb']/ul/li")
    public List<WebElement> suggestionList;

    public void selectSecondSuggestion() {
        searchTextBox.sendKeys("selenium");
        SeleniumUtil.dynamicWaitOnList(suggestionList, driver);
        System.out.println(suggestionList.size());
        System.out.println("List of suggestion is");
        for (WebElement e : suggestionList) {
            System.out.println(e.getText());
        }
        for (int i = 0; i < suggestionList.size(); i++) {
            suggestionList.get(1).click();
            break;
        }

    }

    public String verifySelectedPageTitle() {
        return driver.getTitle();
    }


}
