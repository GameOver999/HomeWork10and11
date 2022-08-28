package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {
    public static void waitVisibilityOfElement (WebDriver driver, WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    //Скролить до тех пор пока елемент не появится на странице; (d = это driver);
    public static void scrollToElementVisibilityOf (WebDriver d, By by){
        JavascriptExecutor js = (JavascriptExecutor) d;
        boolean bool = true;
        while (!bool){
        try {
            d.findElement(by);
            bool = true;
        }catch (Exception ignore){
            js.executeScript("window.scrollBy(0,1000)");
        }
        }
    }

}
