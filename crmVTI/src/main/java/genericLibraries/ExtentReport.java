package genericLibraries;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport extends BaseClass {
	@Test
	public static  void report()  {

	/**	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String exactpath = System.getProperty("user.dir")+"./Errorshot/extend999.png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(exactpath);
		FileUtils.copyFile(photo, dest);
		driver.close();**/

		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/vticrm.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest logger = reports.createTest("Testcase1");
		logger.log(Status.FAIL, "this is  fail");
		
		logger.addScreenCaptureFromPath(System.getProperty("user.dir") + "./Errorshot/screenshot.png");

		reports.flush();
		

	}
}
