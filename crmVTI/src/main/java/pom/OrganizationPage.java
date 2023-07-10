package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(className="hdrLink")
	private WebElement pageHeader ;

	@FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	private WebElement createButton ;
	
	@FindBy(name="accountname")
	private WebElement OrganizationNameTB;
	
	@FindBy(name="industry")
	private WebElement indstryDD;
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	@FindBy(xpath="(//input[@class='crmbutton small save' and@title=\"Save [Alt+S]\"])[1]")
	private WebElement saveButton;
	
	@FindBy(className="dvHeaderText")
	private WebElement createdOrgHeader;
	/**
	 * @return the createdOrgHeader
	 */
	public WebElement getCreatedOrgHeader() {
		return createdOrgHeader;
	}

	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	/**
	 * @return the pageHeader
	 */
	public WebElement getPageHeader() {
		return pageHeader;
	}

	/**
	 * @return the createButton
	 */
	public WebElement getCreateButton() {
		return createButton;
	}

	/**
	 * @return the organizationNameTB
	 */
	public WebElement getOrganizationNameTB() {
		return OrganizationNameTB;
	}

	/**
	 * @return the indstryDD
	 */
	public WebElement getIndstryDD() {
		return indstryDD;
	}

	/**
	 * @return the typeDD
	 */
	public WebElement getTypeDD() {
		return typeDD;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}
}
