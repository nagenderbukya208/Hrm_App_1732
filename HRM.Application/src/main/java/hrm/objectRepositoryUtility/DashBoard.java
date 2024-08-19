package hrm.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Nagender
 * Contains DashBoard elements 
 */
public class DashBoard {
	WebDriver driver;
	public DashBoard(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(xpath ="//a[text()='Dashboard']")
	private WebElement dashBoard;
	
	public WebElement getDashBoard() {
		return dashBoard;
	}
	public void setDashBoard(WebElement dashBoard) {
		this.dashBoard = dashBoard;
	}
}
