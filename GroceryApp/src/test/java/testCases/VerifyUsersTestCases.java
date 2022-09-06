package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.VerifyUsersPage;

public class VerifyUsersTestCases extends BaseClass {
	LoginPage lp;
	VerifyUsersPage vup;

	@Test
	public void verifyNameEnteredInNameOfVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup = new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();
		String actual = vup.getEnteredNameInNameOfVerifyUsersTab("parvathi");
		String expected = "parvathi";
		Assert.assertEquals(actual, expected, "::entered name is not as expected");
	}
	@Test
	public void verifyEmailEnteredInEmailOfVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();
		String actual=vup.getEmailEnteredInEmailTabInVerifyUsersTab("parvathi1mohan@gmail.com");
		String expected="parvathi1mohan@gmail.com";
		Assert.assertEquals(actual, expected,"::entered emailid is not as expected");
	}
	
	@Test
	public void verifyPhoneNoEnteredInPhoneOfVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();
		String actual=vup.getPhoneNoEnteredInPhoneNoTabInVerifyUsersTab("8075680219");
		String expected="8075680219";
		Assert.assertEquals(actual, expected,"::entered phone no in phone no tab is not as expected");
	}
	
	@Test
	public void verifySelectedValueFromStatusDropdownInVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();
		String actual=vup.selectStatusInVerifyUsersTab("Active");
		String expected="Active";
		Assert.assertEquals(actual, expected,"::selected value is not as expected");
	}
	
	@Test
	public void verifyBackgroundColorOfRedColorSearchButtonInVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();
		String actual=vup.getCssValueOfRedColorSearchButtonInVerifyUsersTab("background-color");
		String expected="rgba(220, 53, 69, 1)";
		Assert.assertEquals(actual, expected,"::css value of search button is not as expected");
	}
	
	public void verifyTextOfWhiteResetButtonInVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();	
		String actual=vup.getTextOfWhiteResetButtonInVerifyUsersTab();
		String expected="Reset";
		Assert.assertEquals(actual, expected,"::text of white reset button is not as expected");
	}
	@Test
	public void verifyBackgroundValueOfWhiteResetButtonInVerifyUsersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		vup=new VerifyUsersPage(driver);
		vup.clickVerifyUsersTab();
		vup.clickSearchInVerifyUsersTab();	
		String actual=vup.getCssValueOfWhiteResetButtonInVerifyUsersTab("background-color");
		String expected="rgba(52, 58, 64, 1)";
		Assert.assertEquals(actual, expected,"::css value of white reset button in verify users tab is not as expected");
	}
	
	
}

