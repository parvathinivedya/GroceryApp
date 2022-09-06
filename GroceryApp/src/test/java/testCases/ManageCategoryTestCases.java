package testCases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageCategoryPage;

public class ManageCategoryTestCases extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	ManageCategoryPage mcp;
  @Test
  public void verifyPresenceOfTableData() throws AWTException {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin", "admin");
	  mcp=new ManageCategoryPage(driver);
	  mcp.clickManageCategory();
	  mcp.clickCategoryInManageCategoryTab();
      mcp.clickNewTabInCategoryTab();
      mcp.enterCategoryNameINaddCategoryTab();
      mcp.ClickChooseFile();
      mcp.fileUploadInAddCategoryTab();
      mcp.clickSaveButton();
      String actual=mcp.getDataFromdynamicTable();
      String expected="Shampoo";
      Assert.assertEquals(actual, expected,"::table data not as expected");
      
  }
}
