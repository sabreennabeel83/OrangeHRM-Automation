package Tests;

import Pages.AdminPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AdminPage adminPage ;
    private String UserName = "Admin";
    private String Password = "admin123";
    private By DashboardIcon = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");



    @BeforeClass
    public void SetUP(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }



public void loginAsAdmin() {
    loginPage = new LoginPage(driver);
    loginPage.setUserName(UserName);
    loginPage.setPassword(Password);
    loginPage.ClickLoginButton();
    loginPage.WaitUntitWebElementIsVisable(DashboardIcon);
    Assert.assertTrue(driver.findElement(DashboardIcon).isDisplayed(),"Login was successful");
}




    @AfterClass
    public void TearDown(){
        driver.quit();
    }


}
