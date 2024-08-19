package hrm.objectRepositoryUtility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.webdriverUtility.WebDriverUtility;
/**
 * @author Nagender
 * Contains Project page elements & Creation of project elements 
 */
public class EmployeePage {
	WebDriver driver;
	public EmployeePage(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Employees']")
	private WebElement employePage;
	
	@FindBy(xpath = "//span[text()='Add New Employee']")
	private WebElement addEmpBtn;
	
	@FindBy(xpath = "//label[text()='Name*']/following-sibling::input[@type='text']")
	private WebElement EmpName;
	
	@FindBy(xpath = "//h4[text()='Add Employee']/ancestor::form/descendant::input[@type='email']")
	private WebElement EmpEmail;
	
	@FindBy(xpath = "//h4[text()='Add Employee']/ancestor::form/descendant::label[text()='Phone*']/following-sibling::input")
	private WebElement EmpPh;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement EmpUN;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement EmpDesignation;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement EmpExp;
	
	@FindBy(xpath = "//div[@class='row']/descendant::select[@class='form-control']")
	private WebElement EmpSearchDD;
	
	@FindBy(xpath = "//div[@class='row']/descendant::input[@type='text']")
	private WebElement EmpSearchBox;
	
	public WebElement getEmpSearchBox() {
		return EmpSearchBox;
	}
		
		
	@FindBy(xpath = "//button[text()='×']/preceding-sibling::h4[.='Edit Employee']")
	private WebElement addEmpCancel;
	
	
	
	
	public WebElement getAddEmpCancel() {
		return addEmpCancel;
	}
	public void setAddEmpCancel(WebElement addEmpCancel) {
		this.addEmpCancel = addEmpCancel;
	}
	public void setEmpSearchBox(WebElement empSearchBox) {
		EmpSearchBox = empSearchBox;
	}
	public WebElement getEmpSearchDD() {
		return EmpSearchDD;
	}
	public void setEmpSearchDD(WebElement empSearchDD) {
		EmpSearchDD = empSearchDD;
	}
	@FindBy(name="project")
	private WebElement EmpProj;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Add']")
	private WebElement EmpAddBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEmployePage() {
		return employePage;
	}
	public void setEmployePage(WebElement employePage) {
		this.employePage = employePage;
	}
	public WebElement getAddEmpBtn() {
		return addEmpBtn;
	}
	public void setAddEmpBtn(WebElement addEmpBtn) {
		this.addEmpBtn = addEmpBtn;
	}
	public WebElement getEmpName() {
		return EmpName;
	}
	public void setEmpName(WebElement empName) {
		EmpName = empName;
	}
	public WebElement getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(WebElement empEmail) {
		EmpEmail = empEmail;
	}
	public WebElement getEmpPh() {
		return EmpPh;
	}
	public void setEmpPh(WebElement empPh) {
		EmpPh = empPh;
	}
	public WebElement getEmpUN() {
		return EmpUN;
	}
	public void setEmpUN(WebElement empUN) {
		EmpUN = empUN;
	}
	public WebElement getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(WebElement empDesignation) {
		EmpDesignation = empDesignation;
	}
	public WebElement getEmpExp() {
		return EmpExp;
	}
	public void setEmpExp(WebElement empExp) {
		EmpExp = empExp;
	}
	public WebElement getEmpProj() {
		return EmpProj;
	}
	public void setEmpProj(WebElement empProj) {
		EmpProj = empProj;
	}
	public WebElement getEmpAddBtn() {
		return EmpAddBtn;
	}
	public void setEmpAddBtn(WebElement empAddBtn) {
		EmpAddBtn = empAddBtn;
	}
	public void AddNewEmp(String name, String email, String phoneNm,String userName,String Desig, String Exp, String project) {
		WebDriverUtility wLib= new WebDriverUtility();
		wLib.waitForPageToLoad(driver);
		getAddEmpBtn().click();
		getEmpName().sendKeys(name);
		getEmpEmail().sendKeys(email);
		getEmpPh().sendKeys(phoneNm);
		getEmpUN().sendKeys(userName);
		getEmpDesignation().sendKeys(Desig);
		getEmpExp().sendKeys(Exp);
		wLib.select(getEmpProj(), project);
		getEmpAddBtn().click();
	}
	public void searchEmpDD(int index, String name)
	{
	WebDriverUtility wLib= new WebDriverUtility();
	wLib.waitForPageToLoad(driver);
	wLib.select(getEmpSearchDD(), index);
	getAddEmpCancel().click();
	getEmpSearchBox().sendKeys(name);
	}
	public void empSearchDD(int index) {
	WebDriverUtility wLib= new WebDriverUtility();
	wLib.select(getEmpSearchDD(), index);
	}
	public void searchingProInEmp(String pName) {
	WebDriverUtility wLib= new WebDriverUtility();
	wLib.select(getEmpProj(), pName);
	}
}

