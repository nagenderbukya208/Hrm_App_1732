package e2eTest;

import org.testng.Assert;
import org.testng.annotations.Test;



import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.DashBoard;
import hrm.objectRepositoryUtility.HomePage;

public class E2E_Scenario1 extends BaseClass {
@Test
public void scenario1() {
	DashBoard dash=new DashBoard(driver);
	dash.getDashBoard().click();
	boolean flag = false;
	String currentUrl = driver.getCurrentUrl();
	if(currentUrl.contains("dashboard"))
		flag=true;
	Assert.assertTrue(flag);
	}
}
