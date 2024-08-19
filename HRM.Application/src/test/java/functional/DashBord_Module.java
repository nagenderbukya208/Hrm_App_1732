package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.DashBoard;

public class DashBord_Module extends BaseClass {
	@Test
	public void dashBordbtn() {
	
		DashBoard db= new DashBoard(driver);
		db.getDashBoard().click();
	}

}
