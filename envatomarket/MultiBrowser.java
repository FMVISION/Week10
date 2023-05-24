package envatomarket;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowser {
static WebDriver driver;
static  String browser = "Firefox";
static String url = " https://themeforest.net";
static String expectedTitle = " if";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get(url);
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.out.println(" the title pf page is + ");
        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else {
            System.out.println(" invalid browser");
        }
    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String actualTitle = driver.getTitle();
        System.out.println(" the title of page: + title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

            }
          }


