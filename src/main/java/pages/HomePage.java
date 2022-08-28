package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
//Реализация паттерна PAGE OBJECT;
public class HomePage {
    private  WebDriver driver;
    By courseList = By.className("block-course-cats_item");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void testingcourseButtonClick (){
        List<WebElement> listcourses = driver.findElements(courseList);
        for (WebElement element: listcourses){
            String atrHref = element.findElement(By.tagName("a")).getAttribute("href");
            if (atrHref.contains("testing")){
                element.click();
                break;
            }

        }
    }
}
