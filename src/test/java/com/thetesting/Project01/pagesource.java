package com.thetesting.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class pagesource {

    @Test
    public void task(){
    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--start-maximized");
    WebDriver driver = new EdgeDriver(edgeOptions);
    driver.get("https://katalon-demo-cura.herokuapp.com/");

    Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

    Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

    driver.getPageSource().contains("CURA Healthcare Service");
    driver.quit();
    }
    }
