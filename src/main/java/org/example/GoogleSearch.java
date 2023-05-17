package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        GoogleSearch obj=new GoogleSearch();
        obj.launchBrowser();
        obj.googleSearch();

    }

    public void launchBrowser(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        this.driver=driver;
    }

    private void googleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchArea = driver.findElement(By.xpath("//textarea[@id='APjFqb' or @type='search']"));
        searchArea.sendKeys("selenium");
        Thread.sleep(3000);
        List<WebElement> searchList=driver.findElements(By.xpath("//div[@class='erkvQe']/div[@class='OBMEnb']/ul/li"));
        System.out.println(searchList.size());
        System.out.println("List is");
        for(WebElement e:searchList){
            System.out.println(e.getText());
        }

    }


}
