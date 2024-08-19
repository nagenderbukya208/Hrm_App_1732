package integration;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.webdriverUtility.WebDriverUtility;

public class Sce_4_ProEdit extends BaseClass
{
@Test
public void editProj() throws Throwable {
	WebDriverUtility wLib=new WebDriverUtility();
	wLib.waitForPageToLoad(driver);
	ProjectPage pp= new ProjectPage(driver);
	String proName="Bukya";
	pp.getProjectPage().click();
	pp.searchProjectDD(1);
	pp.getSearchDD().sendKeys(proName);
	pp.getEditProj().click();
	pp.getProjMgrEdit().clear();
	pp.getProjMgrEdit().sendKeys("Naga");
	//pp.getSaveEdit().clear();
	//pp.editStatusBtn(1);
	pp.getSaveEdit().click();
	Thread.sleep(6000);
}
}
