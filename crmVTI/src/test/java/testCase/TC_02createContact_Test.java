package testCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_02createContact_Test extends BaseClass {
@Test
	public void TC_02(){
		String FirstNam="raj"+javauti.generatingRandomNumber(100);
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnContactIcon();
		Assert.assertEquals(contactPag.getPageHeader().getText(),"Contacts");
		System.out.println("contact page is displayed");
		
		contactPag.getAddContactButton().click();
		webDriverUti.handlingDropdown(contactPag.getNameSalutationDD(),1);
		contactPag.getFirstNameTB().sendKeys(FirstNam);
		contactPag.getLastNameTB().sendKeys("p");
		webDriverUti.handlingDropdown(contactPag.getLeadSourceDD(),1);
		contactPag.getSaveButton().click();
		if (contactPag.getContactCreatedHeader().getText().contains(FirstNam)) {
			System.out.println("contact created successfully");
			
		}
		else
			System.out.println("contact not created");
	}
}
