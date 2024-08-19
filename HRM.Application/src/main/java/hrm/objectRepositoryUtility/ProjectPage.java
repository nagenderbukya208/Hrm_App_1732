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
public class ProjectPage {
	WebDriver driver;
	public ProjectPage(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement projectPage;
	
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement createProBtn;
	
	@FindBy(name = "projectName")
	private WebElement ProjName;
	
	@FindBy(name="createdBy")
	private WebElement createdBy;
	
	@FindBy(xpath = "(//select[@name='status'])[2]")
	private WebElement ProjStatus;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SubmitBtn;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement toasterAlert;
	
	@FindBy(xpath = "//div[@class='row']/ancestor::div[@class='table-wrapper']/descendant::select[@class='form-control']")
	private WebElement searchProjDD;
	
	@FindBy(xpath = "//div[@class='table-title']/descendant::div[@class='col-sm-6']/input[@type='text']")
	private WebElement searchDD;
	
//	@FindBy(xpath = "//td[contains(.,'Glatko305')]/ancestor::tr/child::td")
//	private WebElement createProjectName;
	
    @FindBy(xpath = "//i[@title='Edit']")
    private WebElement EditProj;
    
    @FindBy(xpath = "//input[@value='GreenArrow_3838']")
    private WebElement projNameEdit;
    
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    private WebElement projMgrEdit;
    
    @FindBy(xpath = "//select[@name='status']")
    private WebElement statusEdit;
    
    @FindBy(xpath = "(//input[@type='button'])[2]")
    private WebElement saveEdit;
    
    @FindBy(xpath = "//a[@aria-label='Go to next page']")
    private WebElement pagenation;
    
    @FindBy(xpath = "//tr[@class='tr']/ancestor::table[@class='table table-striped table-hover']/descendant::td[contains(.,'NH_PROJ_')]")
    private List<WebElement> projcount;
    
    @FindBy(xpath = "//tr[@class='tr']/ancestor::table[@class='table table-striped table-hover']/descendant::td[contains(.,'NH_PROJ_')]")
    private WebElement projNext;
	
	
	public WebElement getProjNext() {
		return projNext;
	}
	public void setProjNext(WebElement projNext) {
		this.projNext = projNext;
	}
	public List<WebElement> getProjcount() {
		return projcount;
	}
	public void setProjcount(List<WebElement> projcount) {
		this.projcount = projcount;
	}
	public WebElement getPagenation() {
		return pagenation;
	}
	public void setPagenation(WebElement pagenation) {
		this.pagenation = pagenation;
	}
	public WebElement getEditProj() {
		return EditProj;
	}
	public void setEditProj(WebElement editProj) {
		EditProj = editProj;
	}
	public WebElement getProjNameEdit() {
		return projNameEdit;
	}
	public void setProjNameEdit(WebElement projNameEdit) {
		this.projNameEdit = projNameEdit;
	}
	public WebElement getProjMgrEdit() {
		return projMgrEdit;
	}
	public void setProjMgrEdit(WebElement projMgrEdit) {
		this.projMgrEdit = projMgrEdit;
	}
	public WebElement getStatusEdit() {
		return statusEdit;
	}
	public void setStatusEdit(WebElement statusEdit) {
		this.statusEdit = statusEdit;
	}
	public WebElement getSaveEdit() {
		return saveEdit;
	}
	public void setSaveEdit(WebElement saveEdit) {
		this.saveEdit = saveEdit;
	}
//	public WebElement getCreateProjectName() {
//		return createProjectName;
//	}
//	public void setCreateProjectName(WebElement createProjectName) {
//		this.createProjectName = createProjectName;
//	}
	public WebElement getSearchProjDD() {
		return searchProjDD;
	}
	public void setSearchProjDD(WebElement searchProjDD) {
		this.searchProjDD = searchProjDD;
	}
	public WebElement getSearchDD() {
		return searchDD;
	}
	public void setSearchDD(WebElement searchDD) {
		this.searchDD = searchDD;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProjectPage() {
		return projectPage;
	}
	public void setProjectPage(WebElement projectPage) {
		this.projectPage = projectPage;
	}
	public WebElement getCreateProBtn() {
		return createProBtn;
	}
	public void setCreateProBtn(WebElement createProBtn) {
		this.createProBtn = createProBtn;
	}
	public WebElement getProjName() {
		return ProjName;
	}
	public void setProjName(WebElement projName) {
		ProjName = projName;
	}
	public WebElement getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(WebElement createdBy) {
		this.createdBy = createdBy;
	}
	public WebElement getProjStatus() {
		return ProjStatus;
	}
	public void setProjStatus(WebElement projStatus) {
		ProjStatus = projStatus;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	public void setSubmitBtn(WebElement submitBtn) {
		SubmitBtn = submitBtn;
	}

	public WebElement getToasterAlert() {
		return toasterAlert;
	}
	public void setToasterAlert(WebElement toasterAlert) {
		this.toasterAlert = toasterAlert;
	}
	public void createProject(String projectName, String projMan, String status) throws InterruptedException
	{
		WebDriverUtility wLib = new WebDriverUtility();
		wLib.waitForPageToLoad(driver);
		getCreateProBtn().click();
		getProjName().sendKeys(projectName);
		getCreatedBy().sendKeys(projMan);
		wLib.select(getProjStatus(), status);
		getSubmitBtn().click();
	}
	public void searchProjectDD(int index) {
		WebDriverUtility wLib = new WebDriverUtility();
		wLib.select(getSearchProjDD(), index);	
	}
//	 public String getCreatedProjectName(String projName) {
//	        // Return the created project name from the page
//	        return createProjectName.getText();
//	    }
//	 public void searchPro(int index) {
//		 WebDriverUtility wLib = new WebDriverUtility();
//		 wLib.select(getSearchProjDD(), index);
//	 }
	 public void editStatusBtn(int index) {
		 WebDriverUtility wLib = new WebDriverUtility();
		 wLib.select(getStatusEdit(), index);
	 }
}
