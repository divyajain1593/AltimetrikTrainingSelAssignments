package org.altimetrik.Base;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestBaseTest {

    @Test
    public void test(){
        Assert.assertNull(TestBase.driver);
    }
}