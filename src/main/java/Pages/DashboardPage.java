package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DashboardPage extends BasePage{

    private By sideBarList = By.xpath("//ul[@class='oxd-main-menu']/li");

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public void SelectTabFromSidebar(String tab){
        List<WebElement> SideBar= driver.findElements(sideBarList);

        for (int i=0; i<SideBar.size();i++){
            String tabName = SideBar.get(i).getText().toLowerCase();
            if (tabName.contains(tab.toLowerCase())){

                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElements(sideBarList).get(i)).click().perform();
                break;
            }

            else {
                System.out.println("invalid tab name");
            }
        }
    }


    public AdminPage openAdminPage(){

        SelectTabFromSidebar("Admin");
        return new AdminPage(driver);
    }


}
