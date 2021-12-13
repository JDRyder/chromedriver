package com.ryder.chromedriver.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {




    public void searchPoop() throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://google.com/");
        Thread.sleep(5000);
        WebElement searchBox = chromeDriver.findElement(By.name("q"));
        searchBox.sendKeys("poop");
        searchBox.submit();
        Thread.sleep(5000);
        chromeDriver.quit();
    } 

}
