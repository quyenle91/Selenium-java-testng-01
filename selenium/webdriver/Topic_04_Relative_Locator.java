package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_Relative_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Test
    public void TC_01() {
       WebElement rememberMeText = driver.findElement(RelativeLocator.with(By.tagName("label"))
                .near(By.xpath("//a[text()='Forgot password?']"))
                .toRightOf(By.id("RememberMe"))
                .below(By.className("password"))
                .above(By.cssSelector(".login-button")));

       System.out.println(rememberMeText.getText());
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
