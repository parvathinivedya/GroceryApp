package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageOrders {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();

	public ManageOrders(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manageOrders;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchInManageOrderTab;
	
	@FindBy(name="st")
	WebElement statusSelectInManageOrderTab;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetInManageOrdersTab;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/delete?del=547&page_ad=1']//i[@class='fas fa-trash-alt']")
	WebElement deleteButtonInManageOrderTab;
	
	@FindBy(xpath="//table[@class=\"table table-bordered table-hover table-sm\"]//tbody//tr//td[1]")
	WebElement orderIdInManageOrderTab;
	
	@FindBy(id="pt")
	WebElement paymentModeSelectFromDropDown;
    
    public void clickManageOrder() {
		gu.click(manageOrders);
	}
	
	public void clickSearchTab() {
		gu.click(searchInManageOrderTab);
	}
	
	public String getSelectedValueFromDropdown(String dropdownValue) {
		return gu.selectFromDropdown(statusSelectInManageOrderTab,dropdownValue);
	
	}
	
	public String getTextOfSearchInManageOrdesTab() {
		return gu.getElementText(searchInManageOrderTab);
	}
	
	public String getCssValueOfSearchInManageOrdersTab(String elementProperty) {
		return gu.toGetCssValue(searchInManageOrderTab,elementProperty);
	}
	
	public String getCssValueOfResetInManageOrdersTab(String elementproperty) {
		return gu.toGetCssValue(resetInManageOrdersTab, elementproperty);
	}
	
	public String clickDeleteButton() {
		gu.moveToElement(driver, deleteButtonInManageOrderTab);
		return gu.getAlertText(driver);
	}
	
	public String getOrderId() {
		return gu.getElementText(orderIdInManageOrderTab);
		}
	
	}


