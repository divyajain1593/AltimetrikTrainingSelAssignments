package org.altimetrik.Pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.altimetrik.Base.TestBase;
import org.altimetrik.utils.SeleniumUtil;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertMethods_3 extends TestBase {

    public AssertMethods_3() {
        PageFactory.initElements(driver, this);
        driver.get("https://demoqa.com/radio-button");
    }

    @FindBy(xpath = "//label[@for='yesRadio']")
    public WebElement yesRadioButton;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    public WebElement impressiveRadioButton;

    @FindBy(xpath = "//label[@for=\\'noRadio\\']")
    public WebElement noRadioButton;

    @FindBy(xpath = "//label[@for=\\'Radi0\\']")
    public WebElement nonexistentRadioButton;

    @FindBy(className = "text-success")
    public WebElement radioButtonSelectionText;

    public boolean isRadioButtonSelected(){
        yesRadioButton.click();
        return yesRadioButton.isSelected();
    }

    public void nonexistenceButtonSelect () throws NoSuchElementException{
        try {
            nonexistentRadioButton.click();
        }
        catch (NoSuchElementException e){
            throw e;
        }
    }

    public String textOnButtonSelection(){
        yesRadioButton.click();
        SeleniumUtil.dynamicWait(radioButtonSelectionText,driver);
        return radioButtonSelectionText.getText();
    }

    public String assertExample(){
        return driver.getTitle();

    }


}
