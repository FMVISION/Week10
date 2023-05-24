package ultimateqa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class chrome {
static WebDriver driver;
static String url = "https://courses.ultimateqa.com";
static String expectedTitle = " different courses";

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTilte = driver.getTitle();
        System.out.println(" The title page:  + Title");
        Assert.assertTrue(expectedTitle.equals(actualTilte));
        driver.quit();


    }
}
