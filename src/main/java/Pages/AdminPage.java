package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminPage extends BasePage{

    private By searchbyuserName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private By searchBtn = By.xpath("//button[@type='submit']");
    private By recordsFound = By.xpath("//div[@class='oxd-table-body']/div");
    private By deleteIcon = By.cssSelector(".oxd-icon.bi-trash");
    private By status =By.xpath("//div[contains(text(),'Enabled')]");
    private By userNameColumn = By.xpath("//div[@role='row'][not(contains(., 'Username'))]/div[2]");
    private By userRoleColumn = By.xpath("//div[@role='row'][not(contains(., 'User Role'))]/div[3]");







    public AdminPage(WebDriver driver){
        super(driver);

    }
    public void SearchByUserName(String user){
        SendKeysToWebElement(user,searchbyuserName);
        ClickOnWebElement(searchBtn);
    }

    public int NumberOfRecordsFound(){
        WaitUntitWebElementIsVisable(recordsFound);
        List<WebElement> numberOfRecords = driver.findElements(recordsFound);
        return numberOfRecords.size();


    }

    public void DeleteUser(){
        ClickOnWebElement(deleteIcon);
    }



    public String UserRole(){
        return GetTextFromWebElement(userRoleColumn);
    }


    public String UserName (){
         return GetTextFromWebElement(userNameColumn);
    }


    public String UserStatus(){
        WebElement el = WaitUntitWebElementIsVisable(status);
        return el.getText();
    }










}
