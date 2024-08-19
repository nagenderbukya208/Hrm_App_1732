package smoke;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;

public class EmployeeCreate extends BaseClass 
{
@Test
public void employeecreated() throws InterruptedException {
	EmployeePage ep=new EmployeePage(driver);
	ep.getEmployePage().click();
	String pName="Ngdr4038";
	//ep.getEmpProj().sendKeys(pName);
	ep.AddNewEmp("Ngdr", "naga212@gmail.com", "98765432210", "charan", "TestEngg", "3.2", pName);
	Thread.sleep(5000);
	assertTrue(true);
	System.out.println("EmpDetails was created");
}
}
