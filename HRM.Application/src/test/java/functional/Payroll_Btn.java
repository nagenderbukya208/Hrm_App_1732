package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.PayrollPage;

public class Payroll_Btn extends BaseClass {
	@Test
	public void payroll_Sce() throws Throwable {
		String empName="charan965";
		PayrollPage pl= new PayrollPage(driver);
		pl.getPayrollBtn().click();
}}
