import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Titles {

    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raven\\Desktop\\QA\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to("https://www.telerik.com/support/demos");
        driver.manage().window().maximize();

    }

//    @AfterClass
//    public void afterMethod(){
//        driver.close();
//    }

    @Test
    public void testNavBarDesktopButton(){

        WebElement desktopButton = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
        String expectedTitle = "Desktop";
        String actualTitle = desktopButton.getText();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void testNavBarMobileButton(){

        WebElement desktopButton = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
        String expectedTitle = "Mobile";
        String actualTitle = desktopButton.getText();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

}

