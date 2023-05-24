package ultimateqa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class edge {
 static WebDriver driver;
    static String url = "https://courses.ultimateqa.com";
    static String expectedTitle = " different courses";


        public static void main(String[] args) {

            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

            String actualTitle = driver.getTitle();
            System.out.println("The title page of : + Agency Digital");
            Assert.assertTrue(expectedTitle.equals(actualTitle));
            driver.quit();


        }
}
