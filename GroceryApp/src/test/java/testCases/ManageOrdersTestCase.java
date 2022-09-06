package testCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageOrders;

public class ManageOrdersTestCase extends BaseClass {
	LoginPage lp;
	ManageOrders mo;

	@Test
	public void verifySelectedValuesFromStatusDropdown() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		mo.clickSearchTab();
		String actual = mo.getSelectedValueFromDropdown("Paid");
		String expected = "Paid";
		Assert.assertEquals(actual, expected, "::Selected value from dropdown is not as expected");

	}

	@Test
	public void verifyTextOfSearchInManageOrdersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		String actual = mo.getTextOfSearchInManageOrdesTab();
		String expected = "Search";
		Assert.assertEquals(actual, expected, "::text of reset is not as expected");

	}

	@Test
	public void verifyBackgroundColorOfSearchInManageOrdersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		String actual = mo.getCssValueOfSearchInManageOrdersTab("background-color");
		String expected = "rgba(0, 123, 255, 1)";
		Assert.assertEquals(actual, expected, "::css value of search is not as expected");
	}

	@Test
	public void verifyBorderColorOfResetInManageOrdersTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		String actual = mo.getCssValueOfResetInManageOrdersTab("border-color");
		String expected = "rgb(255, 193, 7)";
		Assert.assertEquals(actual, expected, "::css value of reset is not as expected");
	}
	
	@Test
	public void verifyTextOfAlertMessageWhileClickingDeleteButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		String actual=mo.clickDeleteButton();
		String expected="Do you want to delete this Order?";
		Assert.assertEquals(actual, expected,"::Alert message not as expected");
	}
	
	@Test
	public void verifyOrderIdTextInManageOrderTab() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mo = new ManageOrders(driver);
		mo.clickManageOrder();
		String actual = mo.getOrderId();
		String expected = "546";
		Assert.assertEquals(actual, expected, "::order id is not as expected");
	}
}