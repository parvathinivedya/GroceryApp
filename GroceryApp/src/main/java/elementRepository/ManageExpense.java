package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtilities;

public class ManageExpense {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageExpense(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements

	}

	@FindBy(xpath="(//li[@class='nav-item has-treeview']//a[@class='nav-link'])[1]")
	WebElement manageExpenseTab;
	
	@FindBy(xpath="//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/expense-category')]")
    WebElement expenseCategoryInManageExpenseTab;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
    WebElement newTabInExpenseCategory;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchInExpenseCategoryTab;
	
    @FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement resetInExpenseCategoryTab;

	public void clickManageExpenseTab() {
		gu.click(manageExpenseTab);
	}

	public void clickExpenseCategoryInExpenseTab() {
		gu.click(expenseCategoryInManageExpenseTab);
	}

	public String getTextOfNewTabInExpenseTab() {
		return gu.getElementText(newTabInExpenseCategory);
		
	}
	
	public String getTextOfSearchInExpenseCategoryTab() {
		return gu.getElementText(searchInExpenseCategoryTab);
	}
	
	public String getCssValueOfSearchInManageExpenseTab(String elementproperty) {
		return gu.toGetCssValue(searchInExpenseCategoryTab,elementproperty);
	}
	
	public String getTextOfResetInMnageExpenseTab() {
		return gu.getElementText(resetInExpenseCategoryTab);
		
	}
	
	public String getCssValueOfNewTab(String property) {
		return gu.toGetCssValue(newTabInExpenseCategory,property);
	}
}	