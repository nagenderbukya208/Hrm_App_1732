package hrm.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.webdriverUtility.WebDriverUtility;
/**
 * @author Nagender
 * Contains Project page elements & Creation of project elements 
 */
public class ResourcesPage {
  WebDriver driver;
  public ResourcesPage(WebDriver driver) 
{
  this.driver=driver;
  PageFactory.initElements(driver,this);
 }
  @FindBy(xpath = "//a[text()='Resources']")
  private WebElement resourceBtn;
  
  
  @FindBy(xpath = "//span[text()='Upload File']")
  private WebElement uploadFileBtn;
  
  @FindBy(xpath = "//input[@id='upload-file']")
  private WebElement chooseFile;
  
  @FindBy(xpath = "//button[text()='Upload File']")
  private WebElement uploadFileBtn2;
  
  @FindBy(xpath = "//select[@class='form-control']")
  private WebElement searchByFilename;
  
  @FindBy(xpath = "//input[@placeholder='Search by File Name']")
  private WebElement searchBar;
  
  @FindBy(xpath = "(//i[@title='Delete'])[1]")
  private WebElement deleteBtn;
  
  @FindBy(xpath = "//input[@class='btn btn-danger']")
  private WebElement confirmDelete;
  
  @FindBy(xpath = "//i[@title='Download']")
  private WebElement downloadBtn;
  
public WebElement getDownloadBtn() {
	return downloadBtn;
}
public void setDownloadBtn(WebElement downloadBtn) {
	this.downloadBtn = downloadBtn;
}
public WebElement getConfirmDelete() {
	return confirmDelete;
}
public void setConfirmDelete(WebElement confirmDelete) {
	this.confirmDelete = confirmDelete;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public void setDeleteBtn(WebElement deleteBtn) {
	this.deleteBtn = deleteBtn;
}
public WebElement getChooseFile() {
	return chooseFile;
}
public void setChooseFile(WebElement chooseFile) {
	this.chooseFile = chooseFile;
}
public WebElement getUploadFileBtn() {
	return uploadFileBtn;
}
public void setUploadFileBtn(WebElement uploadFileBtn) {
	this.uploadFileBtn = uploadFileBtn;
}
public WebElement getResourceBtn() {
	return resourceBtn;
}
public void setResourceBtn(WebElement resourceBtn) {
	this.resourceBtn = resourceBtn;
}

public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getUploadFileBtn2() {
	return uploadFileBtn2;
}
public WebElement getSearchByFilename() {
	return searchByFilename;
}
public void setSearchByFilename(WebElement searchByFilename) {
	this.searchByFilename = searchByFilename;
}
public WebElement getSearchBar() {
	return searchBar;
}
public void setSearchBar(WebElement searchBar) {
	this.searchBar = searchBar;
}
public void setUploadFileBtn2(WebElement uploadFileBtn2) {
	this.uploadFileBtn2 = uploadFileBtn2;
}
public void selectFile(int index) {
	WebDriverUtility wLib= new WebDriverUtility();
	wLib.select(getSearchByFilename(), index);
	
}
}
