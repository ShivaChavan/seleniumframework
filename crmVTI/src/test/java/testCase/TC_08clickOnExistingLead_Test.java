package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_08clickOnExistingLead_Test extends BaseClass {
	@Test
	public void TC_08() {

		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnleadIcon();
		Assert.assertEquals(leadPag.pageHeaderIsDisplayed(), true);
		System.out.println("lead page is displayed");
		leadPag.getFirstExistingLeadLastNameIcon().click();
		boolean result =leadPag.getExistingLeadHeader().isDisplayed(); 
				Assert.assertEquals(result, true);

		System.out.println("lead is displayed");

	}
}
