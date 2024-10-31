package com.thetesting.ex_26102024_seleniumwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class ex_038_Alerts {

    public static void main(String[] args) {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        // //button[text()='Click for JS Alert']
        // //button[@onclick='jsAlert()']

// WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
// element.click();
// WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
// elementConfirm.click();
 WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
 elementPrompt.click();


        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());



        Alert alert = driver.switchTo().alert();
        alert.sendKeys("PRAMOD");
        alert.accept();
//        alert.dismiss();




        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result,"You successfully clicked an alert");
       //Assert.assertEquals(result,"You clicked: Ok");
         //Assert.assertEquals(result,"You clicked: Cancel");
       Assert.assertEquals(result,"You entered: PRAMOD");




    }

}
