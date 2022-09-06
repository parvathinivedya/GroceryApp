package testCases;

import org.testng.annotations.Test;

import utilities.CaptureScreenshot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
	CaptureScreenshot cps;
	
	public static Properties prop;
	
	public static void testBasic() throws IOException {
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Properties\\Config.properties");
		prop.load(ip);
	}
	
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browserName) throws IOException {
		testBasic();
		if (browserName.equals("chrome")) {
			System.setProperty(prop.getProperty("ChromeDriverFileName"),
					System.getProperty("user.dir") + "\\src\\main\\resources\\Driver files\\chromedrivernew.exe");

			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Driver files\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod(ITestResult itestResult) throws IOException {
		if (itestResult.getStatus() == ITestResult.FAILURE) {// Listener
			cps = new CaptureScreenshot();
			cps.screenshotCapture(driver, itestResult.getName());
		}

		driver.close();
	}

}
