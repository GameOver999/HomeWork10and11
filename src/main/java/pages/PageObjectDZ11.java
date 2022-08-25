package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectDZ11 {

      private static WebDriver driver;

      public PageObjectDZ11(WebDriver driver) {
      }

      public void getCoursesPage(WebDriver driver){
            this.driver = driver;
            driver.get("https://ithillel.ua/courses/java-basic");
      }
     static public void getCourseTitle (){
            String titlePage = driver.getTitle();
            if (titlePage.contains("Базовий курс Java для початківців Київ")){
                  System.out.println(titlePage);
            }
      }


       static public void getCourseRate(){
             String listOfRating = String.valueOf(driver.findElement(By.className("course-rating")).getText());
             System.out.println("Rating = "+listOfRating);


      }

      static public void getCourseDescription() {
            String listDescription = String.valueOf(driver.findElement(By.id("btn-consultation-hero")).getText());
            System.out.println(listDescription);

      }
}