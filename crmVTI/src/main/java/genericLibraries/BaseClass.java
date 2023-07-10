package genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ContactPage;
import pom.HomePage;
import pom.LeadPage;
import pom.OrganizationPage;
import pom.QuickPage;
import pom.loginPage;

public class BaseClass {

	public static WebDriver driver;
	public PropertiesUtility propertyUti;
	public WebDriverUtility webDriverUti;
	public ExtentReport extentrepo;
	public ScreenShot screenShot;
	public JavaUtility javauti;
	public OrganizationPage organizationPag;
	public ContactPage contactPag;

	public loginPage loginPag;
	public HomePage homePag;
	public LeadPage leadPag;
	public QuickPage quickPag;
	public ListenerImplimentation list;

	@BeforeClass(alwaysRun = true)
	public void cofigclass() {
		propertyUti = new PropertiesUtility();
		webDriverUti = new WebDriverUtility();
		screenShot = new ScreenShot();
		javauti = new JavaUtility();
		list=new ListenerImplimentation();

	}

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		if (propertyUti.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		loginPag = new loginPage(driver);
		homePag = new HomePage(driver);
		leadPag = new LeadPage(driver);
		quickPag = new QuickPage(driver);
		organizationPag = new OrganizationPage(driver);
		contactPag = new ContactPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(propertyUti.readingDataFromPropertyFile("url"));

	}

	@AfterMethod
	public void aftermeth() {
   
	
	
		SoftAssert s = new SoftAssert();
		webDriverUti.mouseHoveringOnElement(homePag.administratorDD());
		homePag.clickOnSignOutIcon();

		s.assertTrue(driver.getCurrentUrl().equals("http://localhost:8888/index.php?action=Login&module=Users"));

		System.out.println("sign out  successfull");

		driver.close();
	
	}
}
