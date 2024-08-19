package e2eTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.webdriverUtility.WebDriverUtility;

public class E2E_Scenario2 extends BaseClass {
@Test
public void scenario1() throws Throwable 
{
	WebDriverUtility webLib = new WebDriverUtility();
	//HomePage hp = new HomePage(driver);
	String projName="Glatko"+jLib.getRandomNum();
	
	ProjectPage pp=new ProjectPage(driver);
	pp.getProjectPage().click();
	
	pp.createProject(projName, "Nagender", "Created");
	Thread.sleep(8000);
    pp.searchProjectDD(1);
    pp.getSearchDD().sendKeys(projName);
    Thread.sleep(6000);
    
 // Retrieve the project name from the page
    String actualProjName = driver.findElement(By.xpath("//td[contains(.,'"+projName+"')]")).getText();
    
  //  String actualProjName = pp.getCreatedProjectName(projName);
    
    Assert.assertEquals(actualProjName, projName, "The project name does not match.");
	}
}
