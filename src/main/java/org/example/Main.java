package org.example;


import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main extends BaseClass{

    @Test
    public void Login(){
        System.out.println("hi");
        driver.get("https://www.salesforce.com/form/signup/elf-v2-login/");
    }

    @Test
    public void Logout(){
        System.out.println("logoutlll");
        driver.get("https://www.salesforce.com/form/signup/elf-v2-login/");

    }





}