import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //id
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);
        //class
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);
        //input
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("pierwszy");
        //name
        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);
        //class2
        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);
        //all
        By all = By.cssSelector("*");
        driver.findElements(all);
        //ul in div
        By ulInDiv = By.cssSelector("div ul");
        driver.findElements(ulInDiv);
        //tr in table
        By trInTable = By.cssSelector("table tr");
        driver.findElements(trInTable);
        //tr in body
        By trInBody = By.cssSelector("tbody tr");
        driver.findElements(trInBody);
        //ul in div first child
        By firstChildUlInDiv = By.cssSelector("div > ul");
        driver.findElement(firstChildUlInDiv);
        //tr in tbody first child
        By firstChildTrInTbody = By.cssSelector("tbody > tr");
        driver.findElements(firstChildTrInTbody);
        //first form after label
        By firstFormAfterLable = By.cssSelector("label + form");
        driver.findElement(firstFormAfterLable);
        //all forms after label
        By allFormsAfterLable = By.cssSelector("label ~ form");
        driver.findElements(allFormsAfterLable);

        ///* wartość atrybutu
        //konktetna nazwa atrybutu
        By attrTag = By.cssSelector("input[name='fname']");
        driver.findElement(attrTag);
        //nie znamy pełnej nazwy atrbutu, tylko kawałek nazwy
        By attrContains = By.cssSelector("[name*='ame']");
        driver.findElement(attrContains);
        //nazwa zaczyna się od
        By attrStartsWith = By.cssSelector("[name^='user']");
        driver.findElement(attrStartsWith);
        //nazwa kończy się
        By attrEndsWith = By.cssSelector("[name$='ame'");
        driver.findElement(attrEndsWith);

        ///* dzieci tagu nadrzędnego
        // pierwsze dziecko tagu nadrzędnego
        By liFirstChild = By.cssSelector("li:first-child");
        driver.findElement(liFirstChild);
        // ostatnie dziecko tagu nadrzędnego
        By liLastChild = By.cssSelector("li:last-child");
        driver.findElement(liLastChild);
        //konkretne dziecko tagu nadrzędnego
        By liSecondChild = By.cssSelector("li:nth-child(2)");
        driver.findElement(liSecondChild);


        }
}
