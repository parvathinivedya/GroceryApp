package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String selectFromDropdown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		WebElement selectedValue = s.getFirstSelectedOption();
		String selectedValueText = selectedValue.getText();
		return selectedValueText;
	}

	public String toGetCssValue(WebElement element, String property) {
		String cssValue = element.getCssValue(property);
		return cssValue;
	}

	public boolean isSelectFromRadio(WebElement element) {
		boolean b = element.isSelected();
		return b;
	}

	public String getAttributeValue(WebElement element, String attributeType) {
		String value = element.getAttribute(attributeType);
		return value;

	}

	public String getAlertText(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		return text;

	}

	public void clearValue(WebElement element) {
		element.clear();
	}

	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public void click(WebElement element) {
		element.click();
	}

	public void moveToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();

	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public void fileUpload(String path) throws AWTException {
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);// press control key
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_CONTROL);// once key pressed has to be released.to release the Ctri+v action
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);// to enter the selected file in the window popup which appear when we click
											// choose file
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	}

