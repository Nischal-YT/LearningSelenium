package com.thetesting.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ex_001 {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }
}
