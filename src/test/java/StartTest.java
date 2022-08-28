import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.PageObjectDZ11;
import util.Util;

public class StartTest {

      static final String BASEURL = "https://ithillel.ua/";
      static WebDriver driver = DriverFactory.getDriver("CHROME");
      static HomePage homePage = new HomePage(driver);
      static PageObjectDZ11 getCoursesTitle = new PageObjectDZ11(driver);
      static {
          driver.get(BASEURL);
      }

      public static void main(String[] args) throws Exception {

     //     homePage.testingcourseButtonClick();
     //     System.out.println(driver.getTitle());
     // Варинат, если не создавать конструктор в TestingPage
     //     TestingPage testingPage = PageFactory.initElements(driver,TestingPage.class);
          // Вариант, создание конструктора в TestingPage, тогда пишем такие строки, указаны ниже;
      //    TestingPage testingPage = new TestingPage(driver);
     //     testingPage.buttonClick();
      //    driver.findElement(By.id("input-name-consultation")).sendKeys(DataUserProvider.getRandomAge());
         // driver.get(BASEURL);
          By locatorID = By.id("swiper-coaches");
          Util.scrollToElementVisibilityOf(driver,locatorID);

          try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }
    //    driver.quit();

    }
}
