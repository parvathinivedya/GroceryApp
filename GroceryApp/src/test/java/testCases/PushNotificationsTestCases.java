package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.PushNotificationsPage;

public class PushNotificationsTestCases extends BaseClass {
	LoginPage lp;
	PushNotificationsPage pnp;

	@Test
	public void verifyTitleEnteredInTitleTabOfPushNotificationPage() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		pnp = new PushNotificationsPage(driver);
		pnp.clickPushNotificationsTab();
		String actual = pnp.enterTitleInTitleTabInPushNotificationsTab("Tomorrow there will be no delivery");
		String expected = "Tomorrow there will be no delivery";
		Assert.assertEquals(actual, expected, "::Title entered is not as expected ");
	}

	@Test
	public void verifyDescriptionEnteredInDescriptionTabInPushNotificationsPage() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		pnp = new PushNotificationsPage(driver);
		pnp.clickPushNotificationsTab();
		pnp.enterDescriptionInDecriptionTabInPushNotificationsPage("tomorrow no delivery");
		String actual = "tomorrow no delivery";
		String expected = pnp.verifyAttributeValueOfDescriptionInDecriptionTabInPushNotificationsPage();
		Assert.assertEquals(actual, expected, "::description is not as expected");
	}
	
	@Test
	public void verifyTextOfSendInPushNotificationsPage() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		pnp = new PushNotificationsPage(driver);
		pnp.clickPushNotificationsTab();
		String actual=pnp.getTextOfSendInPushNotificationsPage();
		String expected="Send";
		Assert.assertEquals(actual,expected,"::text of send is not as expected");
	}
}
