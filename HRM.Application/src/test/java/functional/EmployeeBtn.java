package functional;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.EmployeePage;

public class EmployeeBtn extends BaseClass 
{
@Test
public void employeecreated() throws InterruptedException {
	EmployeePage ep=new EmployeePage(driver);
	ep.getEmployePage().click();
	
}
}
