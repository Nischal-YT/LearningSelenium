package com.thetesting.ex_19102024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ex_015 {

    @Test
    public void vwoLogin() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();

    }
}
