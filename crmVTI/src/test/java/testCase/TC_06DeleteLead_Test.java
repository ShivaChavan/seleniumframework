package testCase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_06DeleteLead_Test extends BaseClass {

	@Test
	public void TC_06() throws InterruptedException {
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnleadIcon();
		Assert.assertEquals(leadPag.pageHeaderIsDisplayed(),true);
		System.out.println("lead page is displayed");
		leadPag.clickOnLeadSelectCheckBox();
		WebElement beforedelfirstLead=leadPag.getFirstLeadData();
		System.out.println(beforedelfirstLead.getText());
		leadPag.clickOndeleteButton();
		webDriverUti.handleAlert();
		Thread.sleep(5000);
		WebElement afterdelFirstlead=leadPag.getFirstLeadData();
		System.out.println(afterdelFirstlead.getText());
		if (afterdelFirstlead.getText().equals(beforedelfirstLead.getText())) {
			System.out.println("lead is deleted successfully");
		}
		else
		System.out.println("lead is not deleted successfully");
		
	}
}
