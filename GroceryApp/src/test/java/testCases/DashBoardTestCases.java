package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class DashBoardTestCases extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
  @Test
  public void verifyTextOfDashboard() {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin", "admin");
	  dp=new DashboardPage(driver);
	  String actual= dp.getTextOfDashboard();
	  String expected="Dashboard";
	  Assert.assertEquals(actual, expected,"::text of dashboard is not as expected");
	  
  }
}
