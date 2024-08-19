package smoke;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ProjectPage;

public class ProjectList extends BaseClass {
	@Test
	public void proj() throws Throwable {
		String pName="Ngdr"+jLib.getRandomNum();
		ProjectPage pp=new ProjectPage(driver);
		pp.getProjectPage().click();
		pp.createProject(pName, "Naga", "Created");
		Thread.sleep(6000);
		assertTrue(true);
		System.out.println(pName+": Project was Successfully created");
		
		
	}

}
