package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageCodPage;

public class ManageCodTestCases extends BaseClass{
	LoginPage lp;
	ManageCodPage mcp;
  @Test
  public void verifyCodRadioButtonSelected() {
	  lp=new LoginPage(driver);
	  mcp=new ManageCodPage(driver);
	  lp.performLogin("admin", "admin");
	  mcp.clickManageCodTab();
	  boolean actual=mcp.selectRadioButtonCod();
      boolean expected=true;
      Assert.assertEquals(actual, expected,"::button select is not as expected");
	  
  }
  @Test
  public void verifySaveButtonEnabled() {
	  lp=new LoginPage(driver);
	  mcp=new ManageCodPage(driver); 
	  lp.performLogin("admin", "admin");
	  mcp.clickManageCodTab();
	  boolean actual=mcp.isSaveButtonEnabledInManageCod();
	  boolean expected=true;
	  Assert.assertEquals(actual, expected,"::Save button not enabled as expected");
	  
  }
}
