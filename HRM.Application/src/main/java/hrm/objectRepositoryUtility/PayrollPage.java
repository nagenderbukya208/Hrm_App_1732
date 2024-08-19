package hrm.objectRepositoryUtility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.webdriverUtility.WebDriverUtility;

/**
 * @author Nagender
 * Contains Login page elements & Business lib like login()
 */
public class PayrollPage {
	WebDriver driver;
	public PayrollPage(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Payroll']")
	private WebElement payrollBtn;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement searchByEmp;
	
	@FindBy(xpath = "//div[@class='row']/ancestor::div[@class='table-title']/descendant::input[@type='text']")
	private WebElement searchEmpDetails;
	
	public WebElement getSearchByEmp() {
		return searchByEmp;
	}

	public WebElement getSearchEmpDetails() {
		return searchEmpDetails;
	}
	@FindBy(xpath = "//a[@class='edit']")
	private WebElement editBtn;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement basic_VDA;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement HRA;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	private WebElement Stat_Bonus;
	
	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	private WebElement LTA;
	
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	private WebElement PF;
	
	@FindBy(xpath = "(//input[@class='form-control'])[8]")
	private WebElement PT;
	
	@FindBy(xpath = "(//input[@class='form-control'])[9]")
	private WebElement Insurance;
	
	@FindBy(xpath = "(//input[@class='form-control'])[10]")
	private WebElement LWF;
	
	@FindBy(xpath = "(//input[@class='form-control'])[11]")
	private WebElement NetPay;
	
	@FindBy(xpath = "//div[@class='modal-header']/ancestor::div[@class='modal-content']/descendant::button[@type='button']")
    private WebElement cancelBtn;
	
	
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	@FindBy(xpath = "//select[@name='status']")
	private WebElement selectStatus;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private List<WebElement> AllEle;
	public List<WebElement> getAllEle() {
		return AllEle;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPayrollBtn() {
		return payrollBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getBasic_VDA() {
		return basic_VDA;
	}

	public WebElement getHRA() {
		return HRA;
	}

	public WebElement getStat_Bonus() {
		return Stat_Bonus;
	}

	public WebElement getLTA() {
		return LTA;
	}

	public WebElement getPF() {
		return PF;
	}

	public WebElement getPT() {
		return PT;
	}

	public WebElement getInsurance() {
		return Insurance;
	}

	public WebElement getLWF() {
		return LWF;
	}

	public WebElement getNetPay() {
		return NetPay;
	}

	public WebElement getSelectStatus() {
		return selectStatus;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void earnings(String Basic_VDA,String HRA, String statebonus,String LTA) 
	{
		getBasic_VDA().sendKeys(Basic_VDA);
		getHRA().sendKeys(HRA);
		getStat_Bonus().sendKeys(statebonus);
		getLTA().sendKeys(LTA);
	}
	public void deduction(String PF, String PT,String Insurance, String LWF) {
		getPF().sendKeys(PF);
		getPT().sendKeys(PT);
		getInsurance().sendKeys(Insurance);
		getLWF().sendKeys(LWF);
	}
	public void searchByEmpInfo(int index) {
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.select(getSearchByEmp(), index);
	}
	public void selectStatus(int index) {
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.select(getSelectStatus(), index);
	}
	public void clearAllEle() {
		List<WebElement> list = getAllEle();
		for (WebElement webElement : list) {
			webElement.clear();
		}
	}
}
