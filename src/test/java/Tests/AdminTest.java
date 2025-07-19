package Tests;

import Pages.AdminPage;
import Pages.DashboardPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest{
    String user ="admin";
    private By deleteAlert = By.id("oxd-toaster_1");



    @BeforeMethod
    public void loginBeforeAdminTests() {
        loginAsAdmin();
    }


    @Test
    public void SearchByUserName(){
        dashboardPage =new DashboardPage(driver);
        dashboardPage.openAdminPage();
        adminPage = new AdminPage(driver);
        adminPage.SearchByUserName(user);
        Assert.assertEquals(adminPage.NumberOfRecordsFound(),1);
        Assert.assertEquals(adminPage.UserName(),"Admin");
        Assert.assertEquals(adminPage.UserRole() ,"Admin");
        Assert.assertEquals(adminPage.UserStatus() ,"Enabled");



    }

    @Test
    public void DeleteAdminUser(){

        dashboardPage =new DashboardPage(driver);
        dashboardPage.openAdminPage();
        adminPage = new AdminPage(driver);
        adminPage.SearchByUserName("admin");
        adminPage.DeleteUser();
        Assert.assertTrue( adminPage.WaitUntitWebElementIsVisable(deleteAlert).isDisplayed());





    }



}
