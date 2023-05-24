package comsaucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class edge {

    static WebDriver driver;
    static String url = "https://www.saucedemo.com/ ";
static String expectedTitle =" demo saucelogin page";

    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
driver.get(url);     // launch url
driver.manage().window().maximize();   // maximise the screen
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

String actualtitle = driver.getTitle();     // getting the title of the page
        System.out.println(" the title of the page:  +   Title");

        Assert.assertTrue(expectedTitle.equals(actualtitle));
        driver.quit();


    }
}
