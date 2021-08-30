package com.ryder.chromedriver;

import com.ryder.chromedriver.chrome.Driver;

public class Main {

    public static void main (String[] args) throws InterruptedException {
        Driver driver = new Driver();
        driver.searchPoop();
        System.out.println("yes, i just automated a google search for poop!");
    }
}
