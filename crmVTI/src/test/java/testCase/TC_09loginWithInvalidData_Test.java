package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerImplimentation;

@Listeners(genericLibraries.ListenerImplimentation.class)
public class TC_09loginWithInvalidData_Test extends BaseClass {
	@Test(dataProvider = "loginData", dataProviderClass = genericLibraries.ExcelUtility.class)

	public void TC_09(String user, String pass) throws InterruptedException {
		//SoftAssert soft = new SoftAssert();
		boolean visibilityofHeader = loginPag.getPageHeader().getText().contains("vtiger");
		Assert.assertEquals(true, visibilityofHeader);
		System.out.println("login page is displayed");
		ListenerImplimentation.logger.log(Status.INFO, "logo is displayed");

		loginPag.getUserName().sendKeys(user);
		loginPag.getPassword().sendKeys(pass);

		Assert.assertEquals(loginPag.Loginbuttonisenabled(), true);
		System.out.println("loginPag Button is enabled");
		ListenerImplimentation.logger.log(Status.INFO, "login button is enabled");

		loginPag.clickLoginButton();
		if (loginPag.getErrorMessage().isDisplayed()) {
			System.out.println("Invalid user name or password");
			ListenerImplimentation.logger.log(Status.INFO, "error message ::  Invalid user name or password");

		//	Assert.assertEquals(true, false);

		} else
			System.out.println("login successful");
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
	//	soft.assertAll();

	}

}
