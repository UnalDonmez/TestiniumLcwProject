package Abstract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractBase {
    static WebDriver driver;


    public AbstractBase(WebDriver driver){
        if(this.driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ÜNAL\\IdeaProjects\\TestiniumLcwProject\\chromedriver.exe");
            this.driver = driver;
            driver = new ChromeDriver();
            driver.get("https://www.lcwaikiki.com/tr-TR/TR");
            driver.manage().window().maximize();
            this.driver=driver;
        }

    }
    public void Wait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public String getText(By locator){

        return driver.findElement(locator).getText();
    }
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public void click(By locator){
        find(locator).click();

    }
    public void click(WebElement locator){
        locator.click();

    }
    public void clear(By locator){

        find(locator).clear();
    }
    public void type(By locator , String text){
        find(locator).clear();
        find(locator).sendKeys(text);

    }
    public Boolean isDisplayed(By locator){
        try{
            return find(locator).isDisplayed();
        }
        catch (Exception e){
            return false;
        }

    }
    public void scrollDownToBottom (){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
