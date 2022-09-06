package elementRepository;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageCategoryPage {
	WebDriver driver;
	String addedElementText;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory for initizing the elements
	}

	@FindBy(xpath = "//a[@class='nav-link active']")
	WebElement manageCategory;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	WebElement categoryInManageCategoryTab;

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newTabInCategoryTab;
	
	@FindBy(id="main_img")
	WebElement chooseFileInAddCategoryTab;
	
	@FindBy(id="category")
	WebElement categoryNameInAddCategoryTab;
	
	@FindBy(id="4-selectable")
	WebElement selectGroupsNew;
	
	@FindBy(name="create")
	WebElement saveInAddCategoryTab;
	
	public void clickManageCategory() {
		gu.click(manageCategory);
	}

	public void clickCategoryInManageCategoryTab() {
		gu.click(categoryInManageCategoryTab);
	}
	
	public void clickNewTabInCategoryTab() {
	    gu.click(newTabInCategoryTab);
	}
	
	public String selectGroupsInAddCategoryTab() {
		return gu.selectFromDropdown(selectGroupsNew,"New");
	}
	
	public void ClickChooseFile() {
		gu.click(chooseFileInAddCategoryTab);
	}
	
	public void fileUploadInAddCategoryTab() throws AWTException {
		gu.fileUpload(System.getProperty("user.dir")+"\\src\\main\\resources\\UploadFiles\\ShampooAndCreams.png");
	}
	public void enterCategoryNameINaddCategoryTab() {
		categoryInManageCategoryTab.sendKeys("Shampoo");
	}
	
	public void clickSaveButton() {
		gu.click(saveInAddCategoryTab);
	}
	
	public String getDataFromdynamicTable() {
	List<WebElement>tablelist=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td"));
	for(int i=0;i<tablelist.size();i++) {//to iterate through all elements of table
		if(tablelist.get(i).getText().equals("Shampoo")) {//to find whether shampoo present
			List<WebElement>elementList=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr[" + i +"]//td"));//if shampoo present stops at that row so tr[i] and takes all elementlocation  of corresponding ith row columns
			for(int j=0;j<elementList.size();j++) {//to get through all elements of ith row and column
				if(elementList.get(j).getText().equals("Shampoo")) {//searches for shampoo
					String addedElementText="Shampoo";//if shampoo found return value to string addedelementtext
				}
			}
		
		}
	}

	return addedElementText;
	
	}
}