package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Element_Exercise {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
    }

    @Test
    public void TC_01_Displayed() {
        driver.get("https://www.fahasa.com/customer/account/create");

        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='register_phone']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='register_phone_otp']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='register_password']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='fhs-btn-register']")).isDisplayed());

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='login_username']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='login_password']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//button[@class='fhs-btn-login']")).isDisplayed());
    }

    @Test
    public void TC_02_Enabled_Disabled() {
        driver.get("https://www.fahasa.com/customer/account/create");

        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='register_phone']")).isEnabled());

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='register_phone_otp']")).isEnabled());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='register_password']")).isEnabled());
        Assert.assertFalse(driver.findElement(By.xpath("//button[@class='fhs-btn-register']")).isEnabled());
    }

    @Test
    public void TC_03_Selected() {
        driver.get("https://live.techpanda.org/index.php/customer/account/create/");
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='is_subscribed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='is_subscribed']")).isEnabled());

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='is_subscribed']")).isSelected());

        driver.findElement(By.xpath("//input[@id='is_subscribed']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='is_subscribed']")).isSelected());

    }

    @Test
    public void TC_04_MailChimp() throws InterruptedException {
        driver.get("https://login.mailchimp.com/signup/");
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("quyenlt@gmail.com");

        //Lower-case
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("test");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='lowercase-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='uppercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='number-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='special-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='username-check completed']")).isDisplayed());

        //Upper-case
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("TEST");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='lowercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='uppercase-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='number-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='special-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='username-check completed']")).isDisplayed());

        //Number
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("123");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='lowercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='uppercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='number-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='special-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='username-check completed']")).isDisplayed());

        //special character
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("@#$");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='lowercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='uppercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='number-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='special-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='username-check completed']")).isDisplayed());

        //8 characters
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("quyenlt@gmail.com");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='lowercase-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='uppercase-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='number-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='special-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='username-check not-completed']")).isDisplayed());

        //Full
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("Quyen@1399");
        driver.findElement(By.cssSelector("button[id='create-account-enabled']")).click();
        Thread.sleep(5000);

        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='lowercase-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='uppercase-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='number-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='special-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='8-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='username-check completed']")).isDisplayed());
    }

    @Test
    public void TC_05_Login_emty() {
        driver.get("https://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer-container']//a[@title='My Account']")).click();
        driver.findElement(By.cssSelector("input[id='email']")).clear();
        driver.findElement(By.cssSelector("input[id='pass']")).clear();

        driver.findElement(By.cssSelector("button[id='send2']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='advice-required-entry-email']")).getText(), "This is a required field.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='advice-required-entry-pass']")).getText(), "This is a required field.");

    }

    @Test
    public void TC_06_Login_invalid() {
        driver.get("https://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer-container']//a[@title='My Account']")).click();
        driver.findElement(By.cssSelector("input[id='email']")).clear();
        driver.findElement(By.cssSelector("input[id='pass']")).clear();

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123434@1234.1234");
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
        driver.findElement(By.cssSelector("button[id='send2']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='advice-validate-email-email']")).getText(), "Please enter a valid email address. For example johndoe@domain.com.");
    }

    @Test
    public void TC_07_Login_with_password() {
        driver.get("https://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer-container']//a[@title='My Account']")).click();
        driver.findElement(By.cssSelector("input[id='email']")).clear();
        driver.findElement(By.cssSelector("input[id='pass']")).clear();

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("automation@gmail.com");
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123");
        driver.findElement(By.cssSelector("button[id='send2']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='advice-validate-password-pass']")).getText(), "Please enter 6 or more characters without leading or trailing spaces.");

    }

    @Test
    public void TC_08_Login_incorrect() {
        driver.get("https://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer-container']//a[@title='My Account']")).click();
        driver.findElement(By.cssSelector("input[id='email']")).clear();
        driver.findElement(By.cssSelector("input[id='pass']")).clear();

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("automation@gmail.com");
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123123123");
        driver.findElement(By.cssSelector("button[id='send2']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='main-container col1-layout']//li[@class='error-msg']//span")).getText(), "Invalid login or password.");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
