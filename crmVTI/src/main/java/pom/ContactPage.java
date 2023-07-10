package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//input[@value='T']")
	private WebElement assignedToRadioBT;

	/**
	 * @return the assignedToRadioBT
	 */
	public WebElement getAssignedToRadioBT() {
		return assignedToRadioBT;
	}
	@FindBy(xpath="(//img[@alt='Select'])[1]")
	private WebElement organisationAddButton;
	
	@FindBy(xpath="//a[normalize-space(text()='Organization Name')]/../..//../tr[2]/descendant::a")
	private WebElement existingOrg;

	/**
	 * @return the organisationAddButton
	 */
	public WebElement getOrganisationAddButton() {
		return organisationAddButton;
	}

	/**
	 * @return the existingOrg
	 */
	public WebElement getExistingOrg() {
		return existingOrg;
	}
	@FindBy(className = "hdrLink")
	private WebElement pageHeader;

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement addContactButton;

	@FindBy(name = "salutationtype")
	private WebElement nameSalutationDD;

	@FindBy(name = "firstname")
	private WebElement firstNameTB;

	@FindBy(name = "lastname")
	private WebElement lastNameTB;

	@FindBy(name = "leadsource")
	private WebElement leadSourceDD;

	@FindBy(name = "imagename")
	private WebElement fileChooseButton;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveButton;

	@FindBy(className = "dvHeaderText")
	private WebElement contactCreatedHeader;

	/**
	 * @return the contactCreatedHeader
	 */
	public WebElement getContactCreatedHeader() {
		return contactCreatedHeader;
	}

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the pageHeader
	 */
	public WebElement getPageHeader() {
		return pageHeader;
	}

	/**
	 * @return the addContactButton
	 */
	public WebElement getAddContactButton() {
		return addContactButton;
	}

	/**
	 * @return the nameSalutationDD
	 */
	public WebElement getNameSalutationDD() {
		return nameSalutationDD;
	}

	/**
	 * @return the firstNameTB
	 */
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	/**
	 * @return the lastNameTB
	 */
	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	/**
	 * @return the leadSourceDD
	 */
	public WebElement getLeadSourceDD() {
		return leadSourceDD;
	}

	/**
	 * @return the fileChooseButton
	 */
	public WebElement getFileChooseButton() {
		return fileChooseButton;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}
}
