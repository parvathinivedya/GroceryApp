package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageExpense;
import elementRepository.ManageOrders;

public class ManageExpenseTestCases extends BaseClass {
	LoginPage lp;
	ManageExpense me;

	@Test
	public void verifyTextOfNewTabInManageExpenseTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpenseTab();
		me.clickExpenseCategoryInExpenseTab();
		String actual = me.getTextOfNewTabInExpenseTab();
		String expected = "New";
		Assert.assertEquals(actual, expected, "::text of new tab in manage expense tab is not as expected");
	}
	@Test
	public void verifyBackgroundColorOfNewTabInExpenseCategory() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpenseTab();
		me.clickExpenseCategoryInExpenseTab();
		String actual = me.getCssValueOfNewTab("background-color");
		System.out.println(actual);
		//String expected = "rgba(220,53,69,1)";
		//Assert.assertEquals(actual, expected, "::background color not as expected");
	}

	@Test
	public void verifyTextOfSearchInExpenseCategoryTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpenseTab();
		me.clickExpenseCategoryInExpenseTab();
		String actual = me.getTextOfSearchInExpenseCategoryTab();
		String expected = "Search";
		Assert.assertEquals(actual, expected, "::text of search tab in manage expense tab is not as expected");
	}

	@Test
	public void verifyBackGroundColorValueOfSearchInManageExpenseTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpenseTab();
		me.clickExpenseCategoryInExpenseTab();
		String actual = me.getCssValueOfSearchInManageExpenseTab("background-color");
		String expected = "rgb(0,123,255)";
		Assert.assertEquals(actual, expected, "::css value of search  in manage expense tab is not as expected");
	}

	@Test
	public void verifyTextOfResetInManageExpenseTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpenseTab();
		me.clickExpenseCategoryInExpenseTab();
		String actual = me.getTextOfResetInMnageExpenseTab();
		String expected = "Reset";
		Assert.assertEquals(actual, expected, "::Text of reset in manage expense tab is not as expected");

	}
}
