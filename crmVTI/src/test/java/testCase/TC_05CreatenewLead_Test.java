package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_05CreatenewLead_Test extends BaseClass {
	@Test
	public void TC_05() {

		String lastname = "v" + javauti.generatingRandomNumber(100);
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnleadIcon();
		Assert.assertEquals(leadPag.pageHeaderIsDisplayed(), true);
		System.out.println("lead page is displayed");
		leadPag.clickOnCreateLeadBT();
		Assert.assertEquals(leadPag.pageHeadercreateNewLeadIsDisplayed(), true);
		System.out.println("new lead create page is displayed");
		leadPag.setLastName(lastname);
		leadPag.setCommpanyName("qspider" + javauti.generatingRandomNumber(100));
		leadPag.clickOnSaveButton();
		Assert.assertEquals(leadPag.NewLeadCreatedHeader().getText().contains(lastname), true);
		System.out.println("new lead is created successfully");
		System.out.println(leadPag.NewLeadCreatedHeader().getText());
	}
}
