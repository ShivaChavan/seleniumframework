package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_03CreateContactWithMandatoryField_Test extends BaseClass{
@Test
	public void TC_03() {
	String lastName="v"+javauti.generatingRandomNumber(100);
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnContactIcon();
		Assert.assertEquals(contactPag.getPageHeader().getText(),"Contacts");
		System.out.println("contact page is displayed");
		contactPag.getAddContactButton().click();
		contactPag.getLastNameTB().sendKeys(lastName);
		contactPag.getAssignedToRadioBT().click();
		contactPag.getSaveButton().click();
		if (contactPag.getContactCreatedHeader().getText().contains(lastName)) {
			System.out.println("contact created successfully");
			
		}
		else
			System.out.println("contact not created");
		
	}
}
