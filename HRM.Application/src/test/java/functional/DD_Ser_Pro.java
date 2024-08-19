package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ProjectPage;

public class DD_Ser_Pro extends BaseClass {
	@Test
	public void proj() throws Throwable {
		String pName="Ngdr";
		ProjectPage pp=new ProjectPage(driver);
		pp.getProjectPage().click();
		pp.getSearchProjDD().click();
	}
}
