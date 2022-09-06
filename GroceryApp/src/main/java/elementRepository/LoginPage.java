package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}

	@FindBy(name = "username")
    WebElement userName;

	@FindBy(name = "password")
    WebElement passWOrd;

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
    WebElement adminTextInLoginPage;
	
    public String getTextOfLoginButton() {
		return gu.getElementText(loginButton);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);

	}

	public void enterPassword(String paswrd) {
		passWOrd.sendKeys(paswrd);

	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void performLogin(String username,String paswrd) {
		enterUserName(username);
		enterPassword(paswrd);
		clickLoginButton();
	}
	
	public String getAdminTextInLoginPage() {
		return gu.getElementText(adminTextInLoginPage);
		
	}

}
