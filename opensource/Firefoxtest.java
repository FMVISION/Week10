package opensource;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefoxtest {

    static WebDriver driver;
    static String url = "https: // Demo nopcommerce store";
    static String expectedTtile = "nopCommerce demo store";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("the title page : + title");
        Assert.assertTrue(expectedTtile.equals(actualTitle));
        driver.quit();

    }
}
