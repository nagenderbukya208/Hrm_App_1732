package e2eTest;

import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.PayrollPage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.objectRepositoryUtility.ResourcesPage;
import hrm.webdriverUtility.WebDriverUtility;

public class E2E_Scenario5 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	WebDriverUtility wLib= new WebDriverUtility();
	wLib.waitForPageToLoad(driver);	
	PayrollPage pp= new PayrollPage(driver);
	
	pp.getPayrollBtn().click();
	pp.searchByEmpInfo(0);
	pp.getSearchEmpDetails().sendKeys("NH_01209");
	
	pp.getEditBtn().click();
	
	pp.getBasic_VDA().clear();
	pp.getBasic_VDA().sendKeys("25000");
	
	pp.getPF().clear();
	pp.getPF().sendKeys("2500");
	
	pp.selectStatus(0);
	pp.getSaveBtn().click();
	Thread.sleep(6000);
}
}
