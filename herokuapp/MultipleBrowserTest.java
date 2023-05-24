package herokuapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultipleBrowserTest {
    static String browser = "firefox";
    static WebDriver driver;
    static String url = " https: // demo.nopcommerce.com";
    static String expectedTitle = "if";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get(url);
        }
        else {
            if (browser.equalsIgnoreCase("Firefox")){
                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);
                driver.get(url);
            } else if (browser.equalsIgnoreCase("Edge")) {
                EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver(options);
                driver.get(url);
            } else {
                System.out.println(" Invalid browser");}
            driver.get(url); // launch url
            driver.manage().window().maximize();   //maximise the screen
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));     // giving wait

            String actualTilte = driver.getTitle();
            System.out.println("the tiltle is : + 'Title");
            Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTilte));
            driver.quit();




            }
        }
    }

