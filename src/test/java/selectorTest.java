import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class selectorTest {
    @Test
    public void findElements() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        By firstName =By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
        WebElement firstNameInput2 = driver.findElement(By.name("fname"));

        //topSecret
        WebElement paraHidden = driver.findElement(By.className("topSecret"));

        //tag
        WebElement input = driver.findElement(By.tagName("input"));
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());

        //Tekst linka
        WebElement linkText = driver.findElement(By.linkText("Visit W3Schools.com!"));






    }
}
