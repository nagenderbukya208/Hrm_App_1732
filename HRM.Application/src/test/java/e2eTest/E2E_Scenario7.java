package e2eTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.objectRepositoryUtility.ResourcesPage;
import hrm.webdriverUtility.WebDriverUtility;

public class E2E_Scenario7 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	WebDriverUtility wLib=new WebDriverUtility();
	wLib.waitForPageToLoad(driver);
	String projName="Glatko2205";
	
ProjectPage pp=new ProjectPage(driver);
pp.getProjectPage().click();

pp.searchProjectDD(1);
pp.getSearchDD().sendKeys(projName);
pp.getEditProj().click();
pp.getProjMgrEdit().clear();
pp.getProjMgrEdit().sendKeys("Charan.B");
pp.editStatusBtn(1);
pp.getSaveEdit().click();

String actualProjName = driver.findElement(By.xpath("//td[contains(.,'"+projName+"')]")).getText();

Assert.assertEquals(actualProjName, projName, "The project name does not match.");

Thread.sleep(6000);
}
}
