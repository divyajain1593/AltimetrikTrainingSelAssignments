package org.altimetrik.Pages;

import org.altimetrik.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwitchFrame_2 extends TestBase {

    public SwitchFrame_2() {
        PageFactory.initElements(driver, this);
        driver.get("https://demoqa.com/frames");
    }

    @FindBy(tagName = "iframe")
    public List<WebElement> totalFrame;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    public WebElement frame1Heading;

    @FindBy(id = "sampleHeading")
    public WebElement frame2Heading;

    @FindBy(id = "frame1")
    public WebElement frame1ID;

    public int getTotalFrames() {
        return totalFrame.size();
    }


    public String getFrame1Element() {
        driver.switchTo().frame(0); //switching to frame by index
        return frame1Heading.getText();
    }


    public String getFrame2Element() {
        driver.switchTo().frame("frame2"); //switching to frame by id
        return frame2Heading.getText();
    }

    public int Frame1WebelementLength() {
        driver.switchTo().frame(frame1ID); //switching to frame by webelement
        System.out.println(frame1Heading.getText());
        return frame1Heading.getText().length();
    }


}
