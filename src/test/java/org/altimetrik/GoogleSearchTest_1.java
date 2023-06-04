package org.altimetrik;

import org.altimetrik.Base.TestBase;
import org.altimetrik.Pages.GoogleSearch_1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest_1 extends TestBase {

    GoogleSearch_1 search1;

    @BeforeMethod
    public void setup() {
        initializaton();
        search1 = new GoogleSearch_1();
    }

    @Test(priority = 1)
    public void searchSelectionTest() {
        search1.selectSecondSuggestion();
        Assert.assertNotEquals(search1.verifySelectedPageTitle(), "Google");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
