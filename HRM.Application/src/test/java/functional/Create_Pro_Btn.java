package functional;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ProjectPage;

public class Create_Pro_Btn extends BaseClass{
	@Test
	public void proj() throws Throwable {
		String pName="Ngdr";
		ProjectPage pp=new ProjectPage(driver);
		pp.getProjectPage().click();
		pp.getCreateProBtn().click();
	}
}
