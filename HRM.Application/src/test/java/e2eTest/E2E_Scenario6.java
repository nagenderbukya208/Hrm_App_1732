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

public class E2E_Scenario6 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	WebDriverUtility wLib=new WebDriverUtility();
	wLib.waitForPageToLoad(driver);
	ResourcesPage rp= new ResourcesPage(driver);
    rp.getResourceBtn().click();
   rp.selectFile(0);
  rp.getSearchBar().sendKeys("SHINY INGRID C.pdf");
  Thread.sleep(4000);
  rp.getDeleteBtn().click();
  rp.getConfirmDelete().click();
  Thread.sleep(6000);
}
}
