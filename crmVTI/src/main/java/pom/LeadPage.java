package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class LeadPage extends BaseClass{
	
	@FindBy(xpath="(//input[@value=\"Duplicate\"])[1]")
	private WebElement duplicateButton;
	/**
	 * @return the duplicateButton
	 */
	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	/**
	 * @param duplicateButton the duplicateButton to set
	 */
	public void setDuplicateButton(WebElement duplicateButton) {
		this.duplicateButton = duplicateButton;
	}
	@FindBy(className="hdrLink")
	private WebElement pageHeader;
	
	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement createLeadBT ;
	
	@FindBy(className="lvtHeaderText")
	private WebElement pageHeaderCreateNewLead ;
	
	@FindBy(name="lastname")
	private WebElement lastNameTB ;
	
	@FindBy(name="company")
	private WebElement companyTB ;
	
	@FindBy(className="dvHeaderText")
	private WebElement ExistingLeadHeader;
	
	
	/**
	 * @return the exixtingLeadHeader
	 */
	public WebElement getExistingLeadHeader() {
		return ExistingLeadHeader;
	}
	
	/**
	 * @return the firstExistingLeadLastNameIcon
	 */
	public WebElement getFirstExistingLeadLastNameIcon() {
		return firstExistingLeadLastNameIcon;
	}
	/**
	 * @param firstExistingLeadLastNameIcon the firstExistingLeadLastNameIcon to set
	 */
	public void setFirstExistingLeadLastNameIcon(WebElement firstExistingLeadLastNameIcon) {
		this.firstExistingLeadLastNameIcon = firstExistingLeadLastNameIcon;
	}
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveButton ;
	
	@FindBy(className="dvHeaderText")
	private WebElement newLeadCreatedHeader;
	
	@FindBy(xpath="//table[@class='lvtBg']/descendant::div/descendant::tr[3]/descendant::input")
	private WebElement leadSelectCheckbox;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement deleteButton;
	
	@FindBy(xpath="//table[@class='lvtBg']/descendant::div/descendant::tr[3]/td[2]")
	private WebElement firstLeadData;
	
	@FindBy(xpath="//table[@class='lvt small']/descendant::tr[3]/td[3]/a")
	private WebElement firstExistingLeadLastNameIcon;
	
	
	
public LeadPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement saveButton() {
	return saveButton;
}
public boolean pageHeaderIsDisplayed() {
	return pageHeader.isDisplayed();
}

public void clickOnCreateLeadBT() {
	createLeadBT.click();
}
public boolean pageHeadercreateNewLeadIsDisplayed() {
	return pageHeaderCreateNewLead.isDisplayed();
}
public void setLastName(String username) {
	lastNameTB.sendKeys(username);
	
}
public void setCommpanyName(String companyname) {
	companyTB.sendKeys(companyname);
}
public void clickOnSaveButton() {
	saveButton.click();
}
public WebElement NewLeadCreatedHeader() {
	return newLeadCreatedHeader;
}
public void clickOnLeadSelectCheckBox() {
	leadSelectCheckbox.click();
}
public void clickOndeleteButton() {
	deleteButton.click();
}
public WebElement getFirstLeadData() {
	return firstLeadData;
}

}