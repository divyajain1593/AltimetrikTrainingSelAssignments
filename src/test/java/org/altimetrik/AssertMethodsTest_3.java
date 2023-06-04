package org.altimetrik;

import org.altimetrik.Base.TestBase;
import org.altimetrik.Pages.AssertMethods_3;
import org.altimetrik.Pages.GoogleSearch_1;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertMethodsTest_3 extends TestBase {
    AssertMethods_3 assertMethods;

    @BeforeMethod
    public void setup() {
        initializaton();
        assertMethods = new AssertMethods_3();
    }

    @Test(priority = 1)
    public void radioButtonSelectionTest() {
        Assert.assertTrue(assertMethods.isRadioButtonSelected());
    }

    @Test(priority = 2)
    public void radioButtonSelectionText() {
        Assert.assertEquals(assertMethods.textOnButtonSelection(),"Yes");
    }

    @Test(priority = 3)
    public void assertTest(){
        Assert.assertNotSame(assertMethods.assertExample(),new String("DEMOQA"));
    }

    @Test(priority = 4)
    public void assertThrowTest(){
        Assert.assertThrows(InvalidSelectorException.class, () ->{
            assertMethods.nonexistenceButtonSelect();
        });
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
