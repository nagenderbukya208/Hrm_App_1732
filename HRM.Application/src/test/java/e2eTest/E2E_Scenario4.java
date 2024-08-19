package e2eTest;

import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.objectRepositoryUtility.ResourcesPage;
import hrm.webdriverUtility.WebDriverUtility;

public class E2E_Scenario4 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	WebDriverUtility wLib=new WebDriverUtility();
	wLib.waitForPageToLoad(driver);
	ResourcesPage rp= new ResourcesPage(driver);
    rp.getResourceBtn().click();
    rp.getUploadFileBtn().click();
    rp.getChooseFile().sendKeys("D:\\Tek Pyramid Trining\\Selenium\\Ninza HRM DOC.txt");
    rp.getUploadFileBtn2().click();
    Thread.sleep(5000);
    rp.selectFile(0);
    rp.getSearchBar().sendKeys("Ninza HRM DOC.txt");
    Thread.sleep(5000);
}
}
