package herokuapp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {

    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";

static String expectedTitle = " login page of herokuapp";
    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String actualTitle = driver.getTitle();
        System.out.println( " Title page is : + Title");

        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
