package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageCodPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageCodPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/add-cod']")
	WebElement manageCodTab;
	
	@FindBy(name="cod")
	WebElement codRadioButton;
	
	@FindBy(name="create")
	WebElement saveInManageCod;
	
    public void clickManageCodTab() {
    	gu.click(manageCodTab);
    }
    
    public boolean selectRadioButtonCod() {
    	boolean selectedValue=gu.isSelectFromRadio(codRadioButton);
    	return selectedValue;
    }
    
    public void clickSaveInMangeCoD() {
    	gu.click(saveInManageCod);
    }
    
    public boolean isSaveButtonEnabledInManageCod() {
    	return gu.isEnabled(saveInManageCod);
    }
}
