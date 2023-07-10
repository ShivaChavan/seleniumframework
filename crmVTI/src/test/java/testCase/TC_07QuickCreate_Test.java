package testCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_07QuickCreate_Test extends BaseClass {

	@Test
	public void TC_07() {
		String subject = "qspider" + javauti.generatingRandomNumber(100);
		loginPag.setUserName(propertyUti.readingDataFromPropertyFile("username"));
		loginPag.setPassword(propertyUti.readingDataFromPropertyFile("password"));
		loginPag.clickLoginButton();
		homePag.clickOnQuickCreateDD();
		webDriverUti.handlingDropdown(homePag.getQuickCreateDD(), 8);
		String pageheaderText=quickPag.newEventPageHeader().getText();
		if (pageheaderText.contains("Quick Create")) {
			System.out.println("new event creating page is displayed");
	
		}
		else
		System.out.println("new event creating page not displayed");
		
		quickPag.getSubjectTB().sendKeys(subject);
		quickPag.getStartDateTB().clear();
		quickPag.getStartDateTB().sendKeys("2023-08-27");
		quickPag.getTimeTB().clear();
		quickPag.getTimeTB().sendKeys("17:49");
		quickPag.getEndDateTB().clear();
		quickPag.getEndDateTB().sendKeys("2023-08-28");
		quickPag.getAssignedToRadioElement().click();
		quickPag.getSaveButton().click();
		String quickEventCreatedPageHeader=quickPag.getQuickEventCreatedPageHeader().getText();
		System.out.println(quickEventCreatedPageHeader);
		if (quickEventCreatedPageHeader.contains(subject)) {
			
		
		System.out.println("event created successfully");
	}
		else
			System.out.println("event creation is not successful");
	}
}
