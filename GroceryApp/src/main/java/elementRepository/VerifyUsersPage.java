package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class VerifyUsersPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public VerifyUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/verify-users']")
	WebElement verifyUsersTab;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchInVerifyUsersTab;
	
	@FindBy(id="un")
	WebElement nameInVerifyUsersTab;
	
	@FindBy(id="ut")
	WebElement emailInVerifyUsersTab;
	
	@FindBy(id="ph")
	WebElement phoneNoInVerifyUsersTab;
	
	@FindBy(id="st")
	WebElement statusSelectInVerifyUsersTab;
	
	@FindBy(name="Search")
	WebElement redColourSearchButtonInVerifyUsersTab;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/verify-users']")
	WebElement whiteColorResetInVerifyUsersTab;
	
	public void clickVerifyUsersTab() {
		gu.click(verifyUsersTab);
	}
	
	public void clickSearchInVerifyUsersTab() {
		gu.click(searchInVerifyUsersTab);
	}
	
	public String getEnteredNameInNameOfVerifyUsersTab(String name) {
		nameInVerifyUsersTab.sendKeys(name);
		String enteredName=nameInVerifyUsersTab.getAttribute("value");
		return enteredName;
	}
	
	public String getEmailEnteredInEmailTabInVerifyUsersTab(String emailid) {
		emailInVerifyUsersTab.sendKeys(emailid);
		String enteredEmailId=emailInVerifyUsersTab.getAttribute("value");
		return enteredEmailId;
		
	}
	
	public String getPhoneNoEnteredInPhoneNoTabInVerifyUsersTab(String phoneNo) {
		phoneNoInVerifyUsersTab.sendKeys(phoneNo);
		String enteredPhoneNo=phoneNoInVerifyUsersTab.getAttribute("value");//utiltiy
		return enteredPhoneNo;
	}
	
	public String selectStatusInVerifyUsersTab(String selectedStatus) {
		return gu.selectFromDropdown(statusSelectInVerifyUsersTab,selectedStatus);
	}
	
	public String getCssValueOfRedColorSearchButtonInVerifyUsersTab(String redSearchTabProperty) {
		return gu.toGetCssValue(redColourSearchButtonInVerifyUsersTab,redSearchTabProperty);
		
	}
	
	public String getTextOfWhiteResetButtonInVerifyUsersTab() {
		return gu.getElementText(whiteColorResetInVerifyUsersTab);
	}
	
	public String getCssValueOfWhiteResetButtonInVerifyUsersTab(String whiteResetButtonProperty) {
		return gu.toGetCssValue(whiteColorResetInVerifyUsersTab,whiteResetButtonProperty);
}}
