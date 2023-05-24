package comsaucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Firefox";
    static WebDriver driver;
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = " if";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);

        } else {
            System.out.println("invalid browser");
        }



        driver.get(url);    //launch url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

    String actualTitle = driver.getTitle();
        System.out.println("the title of the page: title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

}
}


