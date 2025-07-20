package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_ElementCommands {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://live.techpanda.org/");
    }

    @Test
    public void TC_01() {
        //Click vào element dạng Button/Checkbox/Radio/Link/Image...
        driver.findElement(By.cssSelector("")).click();

        //Nhập liệu vào các element cho phép edit: Textbox/TextArea/Editable dropdown
        //Trước khi nhập thì clear dữ liệu mặc định
        driver.findElement(By.cssSelector("")).clear();
        driver.findElement(By.cssSelector("")).sendKeys();

        //tìm element từ cha đến con
        driver.findElement(By.cssSelector("")).findElement(By.cssSelector(""));

        //Kiểm tra 1 element là enable hay disable
        //Áp dụng cho tất cả các loại element
        driver.findElement(By.cssSelector("")).isEnabled();
        Assert.assertTrue(driver.findElement(By.cssSelector("")).isEnabled());

        //Kiểm tra 1 element là hiển thị hay không
        //Áp dụng cho tất cả các loại element
        driver.findElement(By.cssSelector("")).isDisplayed();

        //Kiểm tra 1 element đã được chọn hay chưa
        driver.findElement(By.cssSelector("")).isSelected();

        //Lấy dữ liệu dạng text của các element
        driver.findElement(By.cssSelector("")).getText();

        //Lấy ra giá trị thuộc tính HTML
        Assert.assertEquals(driver.findElement(By.cssSelector("")).getAttribute("class"),"input-text required-entry validate-email");

        // Lấy ra giá trị thuộc tính HTML
        driver.findElement(By.cssSelector("")).getDomAttribute("class");

        // Lấy ra giá tr thuộc tính trong DOM (Document Object Model)
        driver.findElement(By.cssSelector("")).getDomProperty("value");

        // Lấy ra giá trị của css (ngôn ngữ FE)
        driver.findElement(By.cssSelector("")).getCssValue("");

        driver.findElement(By.cssSelector("")).getAccessibleName();
        driver.findElement(By.cssSelector("")).getAriaRole();

        driver.findElement(By.cssSelector("")).getTagName();

        //Lấy ra chiều rộng x cao của 1 element
        driver.findElement(By.cssSelector("")).getSize().getHeight();
        driver.findElement(By.cssSelector("")).getSize().getWidth();

        //Lấy ra tọa độ của 1 element
        driver.findElement(By.cssSelector("")).getLocation().getX();
        driver.findElement(By.cssSelector("")).getLocation().getY();

        //Lấy ra cả size vaf location
        driver.findElement(By.cssSelector("")).getRect().getHeight();
        driver.findElement(By.cssSelector("")).getRect().getWidth();
        driver.findElement(By.cssSelector("")).getRect().getX();
        driver.findElement(By.cssSelector("")).getRect().getY();
        driver.findElement(By.cssSelector("")).getRect().getPoint();
        driver.findElement(By.cssSelector("")).getRect().getDimension();

        //Handle shadow DOM
        driver.findElement(By.cssSelector("")).getShadowRoot();

        // Chỉ áp dụng cho element nằm trong form
        driver.findElement(By.cssSelector("")).submit();

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
