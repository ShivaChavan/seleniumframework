package genericLibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ListenerImplimentation  extends BaseClass implements ITestListener {

	ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/vtcrm.html");
	ExtentReports reports = new ExtentReports();
	public static ExtentTest logger;

	@Override
	public void onTestStart(ITestResult result) {
	logger=	reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.log(Status.PASS,"this is passed"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,"this is failed"+result.getMethod().getMethodName());
		logger.addScreenCaptureFromPath(ScreenShot.takescreenshot(result.getMethod().getMethodName()));
//	driver.close();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP,"this is skipped"+result.getMethod().getMethodName());
	}

	@Override
	public void onStart(ITestContext context) {
		reports.attachReporter(reporter);

	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
