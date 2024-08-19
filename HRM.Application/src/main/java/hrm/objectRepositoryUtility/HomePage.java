package hrm.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Nagender
 * Contains Home page elements & Business lib like login()
 */
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//*[name()='svg' and @data-icon='right-from-bracket']")
private WebElement signOutLnk;
public WebElement getSignOutLnk() {
	return signOutLnk;
}
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
public void setSignOutLnk(WebElement signOutLnk) {
	this.signOutLnk = signOutLnk;
}
public void logout() {
//	Actions act= new Actions(driver);
//	act.moveToElement(adminImg).perform();
	signOutLnk.click();
}
}
