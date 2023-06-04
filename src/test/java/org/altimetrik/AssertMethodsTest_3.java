package org.altimetrik;

import org.altimetrik.Base.TestBase;
import org.altimetrik.Pages.AssertMethods_3;
import org.altimetrik.Pages.GoogleSearch_1;
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
//        String str1 = "selenium";
//        String str2 = "selenium";
//        String str3=new String("selenium");
//        String str4=null;
//        Assert.assertSame(assertMethods.assertExample(),new String("DEMOQA"));
        Assert.assertNotSame(assertMethods.assertExample(),new String("DEMOQA"));



    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
