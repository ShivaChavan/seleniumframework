package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerImplimentation;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_01craeteOrganizationusingTypeandIndustry_Test extends BaseClass {
	@Test
	public void TC_01() {
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnOrganizationIcon();
		Assert.assertEquals(organizationPag.getPageHeader().getText(), "Organizations");
		System.out.println("organization page is displayed");
		ListenerImplimentation.logger.log(Status.INFO, "Organisation page is displayed");

		organizationPag.getCreateButton().click();
		String orgName = "qspider" + javauti.generatingRandomNumber(100);
		organizationPag.getOrganizationNameTB().sendKeys(orgName);
		webDriverUti.handlingDropdown(organizationPag.getIndstryDD(), 1);
		webDriverUti.handlingDropdown(organizationPag.getTypeDD(), 1);
		organizationPag.getSaveButton().click();
		if (organizationPag.getCreatedOrgHeader().getText().contains(orgName)) {
			System.out.println("new organization is created successfully");
			ListenerImplimentation.logger.log(Status.INFO, "new organization is created successfully");

		} else
			System.out.println("new organization is not created successfully");
		ListenerImplimentation.logger.log(Status.INFO, "new organization is not created successfully");

	}
}
