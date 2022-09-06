package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class AdminUsersPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}
	
	@FindBy(xpath="//li[@class=\"nav-item\"]//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")
    WebElement adminUsers;
	
	@FindBy(xpath="//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/user/edit?edit=1309')]")
	WebElement editInActionOfAdminUsersTab;
	//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=1278&page_ad=1']//i[@class='fas fa-edit']
	
	@FindBy(id="username")
	WebElement userNameInAdminUsersTab;
	
	@FindBy(id="user_type")
	WebElement userType;
	
	@FindBy(id="password")
	WebElement passWord;
	
	public void clickAdminUsers() {
		gu.click(adminUsers);
	}
	
	public void clickEditInActionOfAdminUsersTab() {
		gu.click(editInActionOfAdminUsersTab);
	}
	
	public void enterUserNameInAdminUsersTab(String username) {
		userNameInAdminUsersTab.sendKeys(username);
	}
	
	public String getAttributeOfUserNameInAdminUsersTab() {
		return gu.getAttributeValue(userNameInAdminUsersTab,"value");
	}
	
	public void clearUserName() {
		gu.clearValue(userNameInAdminUsersTab);
	}
	
	public String selectValueFromUserTypeInAdminUsersTab(String text) {
		return gu.selectFromDropdown(userType,text);
	}
	
	public void clearPasswordFieldInAdminUsersTab() {
		 gu.clearValue(passWord);
	}
	
	public String getPasswordValueInAdminUsersTab(String attributeType) {
		return gu.getAttributeValue(passWord, attributeType);
	}
}
