package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminUsersPage;
import elementRepository.LoginPage;

public class AdminUsersTestCases extends BaseClass {
	LoginPage lp;
	AdminUsersPage aup;
  @Test
  public void verifyUserNameEnteredInAdminUsersTab() {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  aup=new AdminUsersPage(driver);
	  aup.clickAdminUsers();
	  aup.clickEditInActionOfAdminUsersTab();
	  aup.enterUserNameInAdminUsersTab("parvathi123");
	  String actual=aup.getAttributeOfUserNameInAdminUsersTab();
	  String expected="sonu12345parvathi123";
	  Assert.assertEquals(actual, expected,Constant.invalidUserNameEnteredInAdminTabErrorMessage);
  }
  @Test
  public void verifyDataEnteredInUsernameIsCleared() {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  aup=new AdminUsersPage(driver);
	  aup.clickAdminUsers();
	  aup.clickEditInActionOfAdminUsersTab();
	  aup.enterUserNameInAdminUsersTab("parvathi123");
	  aup.clearUserName();
	  String actual=aup.getAttributeOfUserNameInAdminUsersTab();
	  String expected="";
	  Assert.assertEquals(actual, expected,"::data entered is not cleared");
  }
  @Test
  public void verifySelectedUserTypeInAdminUsersTab() {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  aup=new AdminUsersPage(driver);
	  aup.clickAdminUsers();
	  aup.clickEditInActionOfAdminUsersTab();
	  String actual=aup.selectValueFromUserTypeInAdminUsersTab("Staff");
	  System.out.println(actual);
	  String expected="Staff";
	  Assert.assertEquals(actual, expected,"::Selected usertype is not as expected");
	  
  }
  
  @Test
  public void verifyClearPasswordInAdminUsersTab() {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  aup=new AdminUsersPage(driver);
	  aup.clickAdminUsers();
	  aup.clickEditInActionOfAdminUsersTab();
	  aup.clearPasswordFieldInAdminUsersTab();
	  String actual=aup.getPasswordValueInAdminUsersTab("value");
	  System.out.println(actual);
	  String expected="";
	  Assert.assertEquals(actual, expected,"::password is not cleared");
  }
}
