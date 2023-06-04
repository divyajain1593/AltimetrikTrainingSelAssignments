package org.altimetrik;

import org.altimetrik.Base.TestBase;
import org.altimetrik.Pages.AjioProductPurchase_4;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AjioProductTest_4 extends TestBase {
    AjioProductPurchase_4 ajio;

    @BeforeMethod
    public void setup() {
        initializaton();
        ajio = new AjioProductPurchase_4();
    }

    @Test(priority = 1)
    public void loginTest() {
        Assert.assertTrue(ajio.isLoginSuccess());
    }

    @Test(priority = 2)
    public void searchTest() {
        Assert.assertTrue(ajio.isSearchProductPresent(),"searched product not found");
    }

    @Test(priority = 3)
    public void CartTest(){
        Assert.assertTrue(ajio.addTOCart().contains("item"),"no item in bag");
    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
