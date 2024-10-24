package com.thetesting.Project01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class awesomeqaregister {

    @Description("Verify account registration is successfull")
    @Test
    public void createAccount(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Enter first name
        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("Nischal");
        //Enter last name
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("YT");
        //Enter Emailid
        WebElement emailid = driver.findElement(By.id("input-email"));
        emailid.sendKeys("nischal@test.com");
        //Enter Telephone
        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("9999666644");
        //Enter password
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Test@123");
        //Enter cnfpassword
        WebElement cnfpassword = driver.findElement(By.id("input-confirm"));
        cnfpassword.sendKeys("Test@123");
        //privacy policy
        WebElement privacy = driver.findElement(By.name("agree"));
        privacy.click();
        //click on continue
        WebElement clickoncontinue = driver.findElement(By.xpath("//input[@value='Continue']"));;
        clickoncontinue.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // verify test - Your Account Has Been Created!
        WebElement accountCreate = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        System.out.println(accountCreate.getText());
        Assert.assertEquals(accountCreate.getText(),"Your Account Has Been Created!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
