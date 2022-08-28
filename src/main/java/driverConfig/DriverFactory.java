package driverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver getDriver (String brows){
        WebDriver driver = null;
        BROWSER browser = BROWSER.valueOf(brows);
        switch (browser){
            case CHROME:
               driver = initChrome();
               break;
            case FIREFOX: 
               driver = initFireFox();
               break;
        }
        return driver;
    }

    private static WebDriver initFireFox() {
        return new FirefoxDriver();
    }

    private static WebDriver initChrome() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
