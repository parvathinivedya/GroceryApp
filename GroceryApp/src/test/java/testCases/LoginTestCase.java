package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import utilities.ExcelRead;

public class LoginTestCase extends BaseClass {
	
LoginPage lp;
ExcelRead er;

	@Test
	public void verifyTextOfLoginButton() {
		lp = new LoginPage(driver);
		String actual = lp.getTextOfLoginButton();
		String expected = "Sign In";
		Assert.assertEquals(actual, expected, Constant.invalidUserLoginErrorMessage);
	}
	
	@Test
	public void verifyLoginAsValidUser() throws IOException {
		BaseClass.testBasic();
		lp = new LoginPage(driver);
		er=new ExcelRead();
		String usrname=er.readStringData(1,0);
		String pasword=er.readStringData(1,1);
		lp.performLogin(usrname,pasword);//excelread
		String actual=lp.getAdminTextInLoginPage();
		String expected="Admin";
		Assert.assertEquals(actual, expected,prop.getProperty("ErrorMessageForLoginNotAsValidUser"));
		}
	}
