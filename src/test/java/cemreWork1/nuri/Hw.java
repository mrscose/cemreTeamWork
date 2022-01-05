package cemreWork1.nuri;

import org.bouncycastle.jcajce.provider.symmetric.DESede;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Hw {
    WebDriver driver;
    @Test
    public void setUp(){
        driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.amazon.com");


    }

}
