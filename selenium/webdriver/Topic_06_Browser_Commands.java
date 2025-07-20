package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_06_Browser_Commands {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://live.techpanda.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void TC_01() {
        //Mở ra 1 page url (hợp lệ) bất kỳ
        driver.get("");

        //Đóng trình duyệt: đóng hết tất cả, không quan trọng có bao nhiêu tab, window
        driver.quit();

        //Đóng trình duyệt: đóng cái tab/window mà nó đang Active
        driver.close();

        //Tìm 1 element
        driver.findElement(By.cssSelector(""));

        //Tìm nhiều element
        driver.findElements(By.cssSelector(""));

        //Lấy url hiện tại
        Assert.assertEquals(driver.getCurrentUrl(),"https://live.techpanda.org/index.php/customer/account/login/");

        //Lấy source html của page hiện tại
        Assert.assertTrue(driver.getPageSource().contains("Default Description"));

        //Lấy title của page hiện tại
        driver.getTitle();

        //Trả về ID của tab/window hiện tại đang active
        driver.getWindowHandle();

        //Trả về ID của tab/window của tất các tab/window
        driver.getWindowHandles();

        //Mở rộng trình duyệt
        driver.manage().window().maximize();

        //Thu nhỏ trình duyệt
        driver.manage().window().minimize();

        //full màn hình, full viền
        driver.manage().window().fullscreen();

        //Set kích thước của trình duyệt (responsive)
        driver.manage().window().setSize(new Dimension(1920,1080));

        //Lấy ra kích thước của browser là bao nhiêu
        driver.manage().window().getSize();

        //Set màn hình nằm ở vị trí nào so với độ phân giải màn hình hiện tại
        driver.manage().window().setPosition(new Point(300,40));

        //Lấy ra tọa độ của browser đang đứng
        driver.manage().window().getPosition();

        //Set cho việc tìm kiếm element (findElement/findElements)

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
        driver.manage().timeouts().getImplicitWaitTimeout();

        //Áp dụng cho JavaScriptExecutor
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().getScriptTimeout();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().getPageLoadTimeout();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
