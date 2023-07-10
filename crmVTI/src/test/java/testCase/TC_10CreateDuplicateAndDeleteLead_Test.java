package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerImplimentation.class)

public class TC_10CreateDuplicateAndDeleteLead_Test extends BaseClass {
	@Test
	public void TC_10() throws InterruptedException {

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
		Thread.sleep(3000);
		leadPag.getDuplicateButton().click();
		leadPag.clickOnSaveButton();
		Thread.sleep(3000);
		leadPag.clickOndeleteButton();
		webDriverUti.handleAlert();

		WebElement element = driver
				.findElement(By.xpath("//a[contains(text(),'" + lastname + "')]/../..//input[@name='selected_id']"));
		element.click();
		leadPag.clickOndeleteButton();
		webDriverUti.handleAlert();

		Thread.sleep(3000);
		boolean result = webDriverUti.ExplicitWaitforinvisi(element);
		Assert.assertEquals(result, true);
		System.out.println("deleted successfully");

	}
}