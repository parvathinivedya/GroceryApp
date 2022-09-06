package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class PushNotificationsPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public PushNotificationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements
	}

	@FindBy(xpath = "//li[@class=\"nav-item\"]//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-notifications\"]")
	WebElement pushNotificationsTab;
	
	@FindBy(id="title")
	WebElement titleInPushNotificationTab;
	
	@FindBy(id="description")
	WebElement descriptionInPUshNotificationPage;
	
	@FindBy(name="create")
	WebElement sendInPusNotificationsPage;
	
	public void clickPushNotificationsTab() {
		gu.click(pushNotificationsTab);
	}
	
	public String enterTitleInTitleTabInPushNotificationsTab(String title) {
		titleInPushNotificationTab.sendKeys(title);
		return titleInPushNotificationTab.getAttribute("value");
	}
	
	public void enterDescriptionInDecriptionTabInPushNotificationsPage(String description) {
		descriptionInPUshNotificationPage.sendKeys(description);
	
	}
	
	public String verifyAttributeValueOfDescriptionInDecriptionTabInPushNotificationsPage() {
		return gu.getAttributeValue(descriptionInPUshNotificationPage, "value");
	}
	
	public String getTextOfSendInPushNotificationsPage() {
		return gu.getElementText(sendInPusNotificationsPage);
	}
}
