package integration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.DashBoard;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.ProjectPage;
import hrm.webdriverUtility.WebDriverUtility;



public class Sce_1_Pro_DashBoard extends BaseClass {
	@Test
	public void integrationScenario1() throws Throwable 
	{
	WebDriverUtility webLib = new WebDriverUtility();
	HomePage hp = new HomePage(driver);
	String projName="Nashto"+jLib.getRandomNum();
	
	ProjectPage pp=new ProjectPage(driver);
	pp.getProjectPage().click();
	pp.createProject(projName, "Nagender", "Created");
	

	Thread.sleep(5000);
	int sum=0;
	try {
		while(true) {
       //List<WebElement> list = driver.findElements(By.xpath("//tr[@class='tr']/ancestor::table[@class='table table-striped table-hover']/descendant::td[contains(.,'NH_PROJ_')]"));
	  // int projCount=list.size();
		int size = pp.getProjcount().size();
		sum=sum+size;
		}
	}catch (Exception e) {
		
		System.out.println(sum);
	}
}

}
