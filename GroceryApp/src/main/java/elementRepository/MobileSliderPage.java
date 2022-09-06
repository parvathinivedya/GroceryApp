package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class MobileSliderPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}
	@FindBy(xpath="//a[contains(@class,'active nav-link')]")
	WebElement mobileSlider;
	
	@FindBy(xpath="//img[contains(@src,'https://groceryapp.uniqassosiates.com/public/uploads/small/1661959364_e209f00c8b78b8a2aebb')]")
    WebElement imageInMobileSlider;
	
	public void clickMobileSlider() {
		gu.click(mobileSlider);
	}
	public boolean isImageDisplayedInMobileSlider() {
		return gu.isDisplayed(imageInMobileSlider);
	}
}
