package DemoHQ;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Chrome {
    static WebDriver driver;
    static  String url = "https://www.demostack.com/ ";
    static String expectedTitle = " demo HQ";

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println(" the title of page : +title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
