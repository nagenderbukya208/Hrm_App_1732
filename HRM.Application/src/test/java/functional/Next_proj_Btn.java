package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.ProjectPage;

public class Next_proj_Btn extends BaseClass{
	@Test
	public void employeecreated() throws InterruptedException {
		ProjectPage pp= new ProjectPage(driver);
		pp.getProjectPage().click();
		pp.getProjNext().click();
		
	}
}
