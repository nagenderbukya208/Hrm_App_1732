package integration;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.webdriverUtility.WebDriverUtility;

public class Sce_6_Pro_Emp extends BaseClass
{
@Test
public void pro_Emp() throws Throwable {
	
	String proName="RedMe"+jLib.getRandomNum();
	
	ProjectPage pp= new ProjectPage(driver);
	pp.getProjectPage().click();
	
	//pp.getCreateProBtn().click();
	pp.createProject(proName, "Naga", "Created");
	
	Thread.sleep(6000);
	
	EmployeePage ep= new EmployeePage(driver);
	ep.getEmployePage().click();
	ep.getAddEmpBtn().click();
	ep.searchingProInEmp(proName);
	Select  s=new Select(ep.getEmpProj());
	
	String name = s.getFirstSelectedOption().getText();
	//System.out.println(name);

	driver.navigate().back();
	assertEquals(proName, name);
}
}
