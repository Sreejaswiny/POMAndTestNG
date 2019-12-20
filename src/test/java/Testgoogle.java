import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Testgoogle {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver","/Users/sreejaswiny/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Hello World");
        driver.close();
    }
}

