package genericLibraries;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility extends BaseClass {

	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions action = new Actions(driver);

		action.dragAndDrop(source, destination).perform();
	}

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);

		action.contextClick(element).perform();
	}

	public void rightClick() {
		Actions action = new Actions(driver);

		action.contextClick().perform();
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);

		action.doubleClick(element).perform();
	}

	public void doubleClick() {
		Actions action = new Actions(driver);

		action.doubleClick().perform();
	}

	public void mouseHoveringOnElement(WebElement element) {
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
	}

	public Select selectReference(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select;
	}

	public void handlingDropdown(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		try {
			select.selectByValue(value);
		} catch (NoSuchElementException e) {
			select.selectByVisibleText(value);
		}
	}

	public void handlingDropdown(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}

	public void scrollingAction(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	public void scrollingAction(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", element);
	}

	public void enteringDataIntoElement(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "'", element);
	}

	public void clearingDataFromElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumements[0].value=' '", element);
	}

	/**
	 * Switch to frame by index value
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchingToFrame(String value) {
		driver.switchTo().frame(value);
	}

	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}

	public void handleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public WebElement ExplicitWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public Boolean ExplicitWaitforinvisi(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void switchToWindow(Set<String> allWindowId) {
		for (String id : allWindowId) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
						}
		
	}

	
}
