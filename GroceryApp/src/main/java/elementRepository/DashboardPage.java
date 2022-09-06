package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	 public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements
	}
	@FindBy(xpath="//p[text()='Dashboard']")
	WebElement dashboard;
	
	public String getTextOfDashboard() {
		return gu.getElementText(dashboard);
	}
}
