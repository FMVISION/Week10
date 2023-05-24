package comsaucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class chrome {
    static WebDriver driver;
   static  String  url = " https://www.saucedemo.com/";
static String expectedTitle = "demo of the sauce";
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println(" the title of the page is : + title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }

}
