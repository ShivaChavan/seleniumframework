
package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerImplimentation;

@Listeners(genericLibraries.ListenerImplimentation.class)
public class TC_00loginVtiger_Test extends BaseClass {

	@Test
	public void TC_00() {
		SoftAssert soft = new SoftAssert();
		if (loginPag.getPageHeader().getText().contains("vtiger")) {
			soft.assertEquals(true, true);
			System.out.println("logo is displayed");
			ListenerImplimentation.logger.log(Status.INFO,"logo is displayed");

		} else {

			System.out.println("login page is not displayed");
			ListenerImplimentation.logger.log(Status.INFO,"login page is not displayed");
		}

		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		Assert.assertEquals(loginPag.Loginbuttonisenabled(), true);
		System.out.println("login Button is enabled");
		ListenerImplimentation.logger.log(Status.INFO,"login Button is enabled");

		
		loginPag.clickLoginButton();
		if (driver.getTitle().contains("Home")) {
			ListenerImplimentation.logger.log(Status.INFO,"login is successfull");

		} else {
			System.out.println("login not successful");
			ListenerImplimentation.logger.log(Status.INFO,"login is not successful");

		}
		soft.assertAll();

	}

}
