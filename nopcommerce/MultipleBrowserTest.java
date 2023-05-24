package nopcommerce;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;


public class MultipleBrowserTest {
    static String browser = "Firefox";
    static WebDriver driver;
static String url = "https: // demo.nopcommerece.com";
static  String expectedTitle = "if";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();    // setting webdriver
            driver = new ChromeDriver(options);
            driver.get(url);  // launch url
        }
        else {
            if (browser.equalsIgnoreCase("firefox")){
                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);}
            else if (browser.equalsIgnoreCase("edge")){
                EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver(options);}
            else {
                System.out.println("invalid browser");

            }
            driver.get(url);  // launch url
        }
        driver.manage().window().maximize();   //maximising the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  // giving wait
        String actualTitle = driver.getTitle();  // getting title of the page
        System.out.println(" the title page is : + Title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
driver.quit();
    }

}
