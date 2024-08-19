package e2eTest;

import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.webdriverUtility.WebDriverUtility;

public class E2E_Scenario3 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	ProjectPage pp=new ProjectPage(driver);
	EmployeePage ep= new EmployeePage(driver);
	WebDriverUtility wLib= new WebDriverUtility();
	String projName="NNAAGG"+jLib.getRandomNum();
	String empName="RamRam"+jLib.getRandomNum();
	
	pp.getProjectPage().click();
	
	pp.createProject(projName, "Nagender", "Created");

	ep.getEmployePage().click();
	
	ep.AddNewEmp(empName, "nagender212@gmail.com", "9876543210l", "Ngdr", "TestEngg", "3", projName);

	ep.searchEmpDD(0,empName);
	Thread.sleep(6000);
}
}
