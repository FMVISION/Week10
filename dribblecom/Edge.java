package dribblecom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edge {

    static WebDriver driver;
    static String expectedTitle = "portfolia";
    static String url = "https://dribbble.com/";



    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();   // maximising the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));     //   giving wait
        String actualTitle = driver.getTitle();  // getting title of the page
        System.out.println(" Title of the page is : + design portfolia");
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }

}


