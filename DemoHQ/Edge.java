package DemoHQ;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edge {

    static WebDriver driver;
    static  String url = "https://www.demostack.com/ ";
    static String expectedTitle = " demo HQ";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("the titel page is + title");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
