package functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	/**
	 * @author Nagender
	 * Contains Project page elements & Creation of project elements 
	 */
	WebDriver driver;
	public SettingsPage(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Settings']")
	private WebElement settingsPage;
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement tokenLifeSpan;
	
	@FindBy(xpath = "//label[text()='Projects']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='read']")
	private WebElement ProjReadCheckBox;
	@FindBy(xpath = "//label[text()='Projects']/ancestor::div[@class=\"form-group formGroup\"]/descendant::input[@id='Create']")
	private WebElement createCheckBox;
	@FindBy(xpath = "//label[text()='Projects']/ancestor::div[@class=\"form-group formGroup\"]/descendant::input[@id='update']")
	private WebElement updateCheckBox;
	@FindBy(xpath = "//label[text()='Projects']/ancestor::div[@class=\"form-group formGroup\"]/descendant::input[@id='delete']")
	private WebElement deleteCheckBox;
	
	@FindBy(xpath = "//label[text()='Employees']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='read']")
	private WebElement EmpReadCheckBox;
	@FindBy(xpath = "//label[text()='Employees']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='Create']")
	private WebElement EmpCreatecheckBox;
	@FindBy(xpath = "//label[text()='Employees']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='update']")
	private WebElement EmpUpdateCheckBox;
	@FindBy(xpath = "//label[text()='Employees']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='delete']")
	private WebElement EmpDeleteCheckBox;
	
	@FindBy(xpath = "//label[text()='Payroll']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='read']")
	private WebElement PayrollReadCheckBox;
	@FindBy(xpath = "//label[text()='Payroll']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='Create']")
	private WebElement payrollCreateCheckbox;
	@FindBy(xpath = "//label[text()='Payroll']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='update']")
	private WebElement payrollupdateCheckBox;
	@FindBy(xpath = "//label[text()='Payroll']/ancestor::div[@class='form-group formGroup']/descendant::input[@id='delete']")
	private WebElement payrollDeletecheckBox;
	
	@FindBy(xpath = "//button[text()='Generate New Token']")
	private WebElement generatetokenBtn;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSettingsPage() {
		return settingsPage;
	}

	public void setSettingsPage(WebElement settingsPage) {
		this.settingsPage = settingsPage;
	}

	public WebElement getTokenLifeSpan() {
		return tokenLifeSpan;
	}

	public void setTokenLifeSpan(WebElement tokenLifeSpan) {
		this.tokenLifeSpan = tokenLifeSpan;
	}

	public WebElement getProjReadCheckBox() {
		return ProjReadCheckBox;
	}

	public void setProjReadCheckBox(WebElement projReadCheckBox) {
		ProjReadCheckBox = projReadCheckBox;
	}

	public WebElement getCreateCheckBox() {
		return createCheckBox;
	}

	public void setCreateCheckBox(WebElement createCheckBox) {
		this.createCheckBox = createCheckBox;
	}

	public WebElement getUpdateCheckBox() {
		return updateCheckBox;
	}

	public void setUpdateCheckBox(WebElement updateCheckBox) {
		this.updateCheckBox = updateCheckBox;
	}

	public WebElement getDeleteCheckBox() {
		return deleteCheckBox;
	}

	public void setDeleteCheckBox(WebElement deleteCheckBox) {
		this.deleteCheckBox = deleteCheckBox;
	}

	public WebElement getEmpReadCheckBox() {
		return EmpReadCheckBox;
	}

	public void setEmpReadCheckBox(WebElement empReadCheckBox) {
		EmpReadCheckBox = empReadCheckBox;
	}

	public WebElement getEmpCreatecheckBox() {
		return EmpCreatecheckBox;
	}

	public void setEmpCreatecheckBox(WebElement empCreatecheckBox) {
		EmpCreatecheckBox = empCreatecheckBox;
	}

	public WebElement getEmpUpdateCheckBox() {
		return EmpUpdateCheckBox;
	}

	public void setEmpUpdateCheckBox(WebElement empUpdateCheckBox) {
		EmpUpdateCheckBox = empUpdateCheckBox;
	}

	public WebElement getEmpDeleteCheckBox() {
		return EmpDeleteCheckBox;
	}

	public void setEmpDeleteCheckBox(WebElement empDeleteCheckBox) {
		EmpDeleteCheckBox = empDeleteCheckBox;
	}

	public WebElement getPayrollReadCheckBox() {
		return PayrollReadCheckBox;
	}

	public void setPayrollReadCheckBox(WebElement payrollReadCheckBox) {
		PayrollReadCheckBox = payrollReadCheckBox;
	}

	public WebElement getPayrollCreateCheckbox() {
		return payrollCreateCheckbox;
	}

	public void setPayrollCreateCheckbox(WebElement payrollCreateCheckbox) {
		this.payrollCreateCheckbox = payrollCreateCheckbox;
	}

	public WebElement getPayrollupdateCheckBox() {
		return payrollupdateCheckBox;
	}

	public void setPayrollupdateCheckBox(WebElement payrollupdateCheckBox) {
		this.payrollupdateCheckBox = payrollupdateCheckBox;
	}

	public WebElement getPayrollDeletecheckBox() {
		return payrollDeletecheckBox;
	}

	public void setPayrollDeletecheckBox(WebElement payrollDeletecheckBox) {
		this.payrollDeletecheckBox = payrollDeletecheckBox;
	}

	public WebElement getGeneratetokenBtn() {
		return generatetokenBtn;
	}

	public void setGeneratetokenBtn(WebElement generatetokenBtn) {
		this.generatetokenBtn = generatetokenBtn;
	}
}
