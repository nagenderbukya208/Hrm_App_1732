package smoke;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;

public class Emp_DD_Module extends BaseClass{
	@Test
	public void sce_Emp_DD() {
		EmployeePage ep=new EmployeePage(driver);
		ep.getEmployePage().click();
		ep.empSearchDD(2);
		String res = ep.getEmpSearchBox().getAttribute("placeholder");
		System.out.println(res);
	}
}
