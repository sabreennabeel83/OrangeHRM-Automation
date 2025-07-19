package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By UserName =By.xpath("//input[@name='username']");
    private By Password = By.cssSelector("input[placeholder='Password']");
    private By LoginBtn = By.xpath("//button[@type='submit']");



    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void setUserName(String userName){
        SendKeysToWebElement(userName,UserName);
    }

    public void setPassword(String password){
        SendKeysToWebElement(password,Password);
    }

    public void ClickLoginButton(){
        ClickOnWebElement(LoginBtn);
    }



}
