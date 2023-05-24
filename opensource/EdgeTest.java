package opensource;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {

    static WebDriver driver;
    static String url = "https:// opensource-demo.orangehrmlive.com";
    static String expectedTitle = "orange hrm demo";


    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
    driver = new EdgeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    driver.get(url);
    String actualTitle = driver.getTitle();
        System.out.println("the title page : title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();



    }
}
