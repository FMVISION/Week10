package nopcommerce;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {


    static WebDriver driver;
static String url = "https://demo.nopcommerce.com";
static String expectedTitle = "nopCommerce demo store";

    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
        driver= new EdgeDriver(options);
        driver.get(url);   // launch url
        driver.manage().window().maximize();      // maximising the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();      // getting title pf the page
        System.out.println(" The title of page : + Title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.close();
    }
}
