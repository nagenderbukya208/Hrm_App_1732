package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;

public class Add_Emp_Btn extends BaseClass{
	@Test
	public void employeecreated() throws InterruptedException {
		EmployeePage ep=new EmployeePage(driver);
		ep.getEmployePage().click();
		ep.getAddEmpBtn().click();
		
	}
}
