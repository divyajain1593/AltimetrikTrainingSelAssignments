package org.altimetrik;

import org.altimetrik.Base.TestBase;
import org.altimetrik.Pages.SwitchFrame_2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchFrameTest_2 extends TestBase {


    SwitchFrame_2 switchFrame;

    @BeforeMethod
    public void setup() {
        initializaton();
        switchFrame = new SwitchFrame_2();
    }

    @Test(priority = 1)
    public void numberOfFramesTest() {
        Assert.assertEquals(switchFrame.getTotalFrames(), 6);
    }

    @Test(priority = 2)
    public void switchToFrame1Test() {
        Assert.assertEquals(switchFrame.getFrame1Element(), "This is a sample page");
    }

    @Test(priority = 3)
    public void switchToFrame2Test() {
        Assert.assertEquals(switchFrame.getFrame2Element(), "This is a sample page");
    }

    @Test(priority = 4)
    public void frame1ElementLengthTest() {
        Assert.assertEquals(switchFrame.Frame1WebelementLength(), 21);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}
