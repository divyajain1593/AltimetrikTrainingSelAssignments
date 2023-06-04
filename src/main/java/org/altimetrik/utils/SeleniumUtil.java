package org.altimetrik.utils;

import org.altimetrik.Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SeleniumUtil extends TestBase {

    public static void dynamicWaitOnList(List<WebElement> element, WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public static void dynamicWait(WebElement element, WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));
    }

    public static void switchToChildWindow(){
        Set<String> allWindowHandles= driver.getWindowHandles();
        Iterator<String> iterator=allWindowHandles.iterator();
        while(iterator.hasNext()){
            String childWindow= iterator.next();
            driver.switchTo().window(childWindow);
        }

    }

    public static void wait(int sec){
        try{
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
