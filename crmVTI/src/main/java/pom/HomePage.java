package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//a[@href=\"index.php?action=index&module=Home\"]")
	private WebElement pageHeader;

	@FindBy(xpath = "//a[@href='index.php?module=Leads&action=index']")
	private WebElement leadIcon;

	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contactIcon;

	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")
	private WebElement organizationIcon;

	@FindBy(id = "qccombo")
	private WebElement quickCreateDD;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorDD;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutIcon;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeader() {
		return pageHeader;
	}

	public boolean pageheaderIsDisplayed() {

		return pageHeader.isDisplayed();
	}

	public void clickOnContactIcon() {
		contactIcon.click();
	}

	public void clickOnOrganizationIcon() {
		organizationIcon.click();
	}

	public void clickOnleadIcon() {
		leadIcon.click();
	}

	public void clickOnQuickCreateDD() {
		quickCreateDD.click();
	}
	public WebElement administratorDD() {
		return administratorDD;
	}
	public void clickOnSignOutIcon() {
		signOutIcon.click();
	}
	public WebElement getQuickCreateDD() {
		return quickCreateDD;
	}
}