package integration;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ProjectPage;

public class Sce_2_ProDD_DD extends BaseClass
{
@Test
public void projDD_ddId() throws InterruptedException {
	ProjectPage pp= new ProjectPage(driver);
	pp.getProjectPage().click();
	pp.searchProjectDD(2);
     String msg = pp.getSearchDD().getAttribute("placeholder");
	System.out.println(msg);
 }
}
