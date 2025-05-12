import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        //Dimension windowSize = new Dimension(200, 200);
        //driver.manage().window().setSize(windowSize);
        driver.get("https://www.google.com");
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        // klikniecie przycisku
        agreeButton.click();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());


    }




    public WebDriver getDriver (String browser) {
        switch (browser) {
            case "ie":
                //InternetExplorerOptions options = new InternetExplorerOptions();
                //options.withInitialBrowserUrl("https://www.google.com");
                return new InternetExplorerDriver();
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aurelka\\Downloads\\chromedriver-win64\\chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                //System.setProperty("webdriver.firefox.driver", "C:\\Users\\Aurelka\\Downloads\\geckodriver.exe");
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browser");


        }
    }
}
