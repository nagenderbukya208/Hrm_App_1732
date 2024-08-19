package e2eTest;

import java.io.File;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.DashBoard;
import hrm.objectRepositoryUtility.ResourcesPage;

public class E2E_Scenario8 extends BaseClass 
{
	@Test 
	public void scenario8() {
	ResourcesPage rp= new ResourcesPage(driver);
	rp.getResourceBtn().click();
	rp.getDownloadBtn().click();
	String downlod="D:/Tek Pyramid Trining/Selenium";
	File downloads=new File(downlod);
	}

}
