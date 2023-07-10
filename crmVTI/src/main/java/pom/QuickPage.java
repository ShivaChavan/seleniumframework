package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class QuickPage extends BaseClass {

	@FindBy(xpath="//i[text()='Quick Create']")
	private WebElement NewEventPgeHeader;
	
	@FindBy(name="subject")
	private WebElement subjectTB;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignedToRadioElement;
	
	@FindBy(name="due_date")
	private WebElement endDateTB;
	
	@FindBy(name="date_start")
	private WebElement startDateTB;
	
	@FindBy(name="time_start")
	private WebElement timeTB;
	
	@FindBy(xpath="(//input[@class='crmbutton small save' and @title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	@FindBy(className="lvtHeaderText")
	private WebElement quickEventCreatedPageHeader;
	
	
	
	

	public QuickPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	

	/**
	 * @return the subjectTB
	 */
	public WebElement getSubjectTB() {
		return subjectTB;
	}

	/**
	 * @return the assignedToRadioElement
	 */
	public WebElement getAssignedToRadioElement() {
		return assignedToRadioElement;
	}

	/**
	 * @return the endDateTB
	 */
	public WebElement getEndDateTB() {
		return endDateTB;
	}

	/**
	 * @return the startDateTB
	 */
	public WebElement getStartDateTB() {
		return startDateTB;
	}

	/**
	 * @return the timeTB
	 */
	public WebElement getTimeTB() {
		return timeTB;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * @return the quickEventCreatedPageHeader
	 */
	public WebElement getQuickEventCreatedPageHeader() {
		return quickEventCreatedPageHeader;
	}
	public WebElement newEventPageHeader() {
	return NewEventPgeHeader;
	}

	
}
