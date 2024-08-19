package integration;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;

public class Sce_3_EmpDD_DD extends BaseClass {
@Test
public void sce_Emp_DD() {
	EmployeePage ep=new EmployeePage(driver);
	ep.getEmployePage().click();
	ep.empSearchDD(2);
	String res = ep.getEmpSearchBox().getAttribute("placeholder");
	System.out.println(res);
}
}
