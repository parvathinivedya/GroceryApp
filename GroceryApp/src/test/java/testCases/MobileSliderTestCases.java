package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.MobileSliderPage;

public class MobileSliderTestCases extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	MobileSliderPage msp;
  @Test
  public void verifyImageDisplayedInMobileSlider() {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin","admin");
	  msp=new MobileSliderPage(driver);
	  msp.clickMobileSlider();
	  boolean actual=msp.isImageDisplayedInMobileSlider();
	  boolean expected=true;
	  Assert.assertEquals(actual,expected,"::image not displayed as expected");
	  
  }
}
