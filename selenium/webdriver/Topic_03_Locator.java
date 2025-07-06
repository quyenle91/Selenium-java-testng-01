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

    @Test
    public void TC_02_Class() {
        driver.findElement(By.className("validate-email"));
        driver.findElement(By.className("validate-password"));
    }

    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("login[username]"));
        driver.findElement(By.name("login[password]"));
    }

    @Test
    public void TC_04_Tagname() {
        int listInput = driver.findElements(By.tagName("input")).size();
        System.out.println(listInput);
    }

    @Test
    public void TC_05_LinkText() {
        // Dung voi duong link
        // Tuyet doi: truyen ca text
        driver.findElement(By.linkText("MY ACCOUNT"));
        driver.findElement(By.linkText("ORDERS AND RETURNS"));
    }

    @Test
    public void TC_06_Partial_LinkText() {
        // Dung voi duong link
        // Tuong doi: Lay 1 phan hoac tat ca
        driver.findElement(By.partialLinkText("ACCOUNT"));
        driver.findElement(By.partialLinkText("ORDERS AND"));
    }

    @Test
    public void TC_07_Css() {
        // cau truc css: thehtml[attribute='value']
        //Css voi ID
        //Dau # dai dien viet tat cho ID
        driver.findElement(By.cssSelector("input[id='email']"));
        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector("input#email"));

        //Css voi Class
        driver.findElement(By.cssSelector("div[class='account-login']"));
        driver.findElement(By.cssSelector(".account-login"));
        driver.findElement(By.cssSelector("div.account-login"));

        driver.findElement(By.cssSelector("div[class='col-2 registered-users']"));
        driver.findElement(By.cssSelector(".registered-users"));
        driver.findElement(By.cssSelector("div.registered-users"));
        driver.findElement(By.cssSelector("div.registered-users.col-2"));

        //Css voi Name
        driver.findElement(By.cssSelector("input[name='login[username]']"));

        //Css voi Tagname
        driver.findElement(By.cssSelector("input"));

        //Css voi Link
        driver.findElement(By.cssSelector("a[href='http://live.techpanda.org/index.php/customer/account/']"));

        //Css voi PartialLink
        driver.findElement(By.cssSelector("a[href*='customer/account/']"));
    }

    @Test
    public void TC_08_XPath() {
        // cau truc XPath: //thehtml[@attribute='value']
        //XPath voi ID
        driver.findElement(By.xpath("//input[@id='email']"));

        //XPath voi Class
        driver.findElement(By.xpath("//div[@class='account-login']"));
        driver.findElement(By.xpath("//div[@class='col-2 registered-users']"));

        //XPath voi Name
        driver.findElement(By.xpath("//input[@name='login[username]']"));

        //XPath voi Tagname
        driver.findElement(By.xpath("//input"));

        //XPath voi Link
        driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/customer/account/']"));
        driver.findElement(By.xpath("//a[text()='My Account']"));

        //XPath voi PartialLink
        driver.findElement(By.xpath("//a[contains(@href,'customer/account')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Account')]"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
