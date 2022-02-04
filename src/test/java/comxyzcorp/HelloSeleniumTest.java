package comxyzcorp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    private static ChromeDriver chromeDriver;
    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ines.tabka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testPage(){
        chromeDriver.get("https://www.google.com/");
        chromeDriver.manage().window().setSize(new Dimension(1163, 810));
        chromeDriver.findElement(By.cssSelector("form > div:nth-child(1)")).click();
        chromeDriver.findElement(By.name("q")).click();
        chromeDriver.findElement(By.name("q")).sendKeys("behavior driven development");
        chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @AfterAll
    public static void cleanup(){
        chromeDriver.close();
    }



}
