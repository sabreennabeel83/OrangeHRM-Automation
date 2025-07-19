package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver=driver;

    }

    public WebElement WaitUntitWebElementIsVisable(By element){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    public void SendKeysToWebElement(String text,By element){
       WebElement el= WaitUntitWebElementIsVisable(element);
        el.sendKeys(text);

    }

    public String GetTextFromWebElement(By element){
        WebElement el= WaitUntitWebElementIsVisable(element);
        return el.getText();
    }

    public void ClickOnWebElement(By element){
        WebElement el= WaitUntitWebElementIsVisable(element);
       el.click();
    }











}
