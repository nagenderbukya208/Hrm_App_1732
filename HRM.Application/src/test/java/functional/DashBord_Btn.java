package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.DashBoard;

public class DashBord_Btn extends BaseClass{
	@Test
	public void dashBordPage() {
	DashBoard db= new DashBoard(driver);
	db.getDashBoard().click();
	}

}
