package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class loginPage extends BaseClass {

	@FindBy(xpath = "//img[@src='test/logo/vtiger-crm-logo.gif']")
	private WebElement logo;

	@FindBy(xpath = "//a[text()='vtiger']")
	private WebElement pagerHeader;

	@FindBy(name = "user_name")
	private WebElement userNameTB;

	@FindBy(name = "user_password")
	private WebElement passwordTB;

	@FindBy(id = "submitButton")
	private WebElement LoginButton;

	@FindBy(className="errorMessage")
	private WebElement errorMessage;
	
	/**
	 * @return the errorMessage
	 */
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getPageHeader() {
		return pagerHeader;
	}

	public boolean Loginbuttonisenabled() {
		return LoginButton.isEnabled();
	}

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String username) {
		userNameTB.sendKeys(username);
	}

	public void setPassword(String password) {
		passwordTB.sendKeys(password);
	}

	public void clickLoginButton() {
		LoginButton.click();
	}
	public WebElement getUserName() {
	return	userNameTB;
	}
	public WebElement getPassword() {
	return	passwordTB;
	}
}
