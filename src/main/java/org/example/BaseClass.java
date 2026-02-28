package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    String browser = "chrome";

    @BeforeMethod
    public void BeforeTest(){

        if (browser.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadTimeout(Duration.ofSeconds(5));
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }



    }

    @AfterMethod
    public void teradown(){
        driver.quit();
    }

}
