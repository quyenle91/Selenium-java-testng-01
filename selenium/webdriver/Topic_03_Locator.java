package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
    }

    @Test
    public void TC_01_ID() {
        driver.findElement(By.id("email"));
        driver.findElement(By.id("pass"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
