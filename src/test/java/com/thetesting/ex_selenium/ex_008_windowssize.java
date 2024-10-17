package com.thetesting.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class ex_008_windowssize {
    @Test
    public void testMethod01(){
        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=800,600");




        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");






    }
}