package DemoHQ;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefox {
    static WebDriver driver;
    static  String url = "https://www.demostack.com/ ";
    static String expectedTitle = " demo HQ";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println(" the title page of + title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
