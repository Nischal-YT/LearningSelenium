package com.thetesting.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex_003 {

    @Test
    public void test_001() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
