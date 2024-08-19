package smoke;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.PayrollPage;

public class PayRoll_Page extends BaseClass{
	@Test
	public void payroll_Sce() throws Throwable {
		String empName="charan965";
		PayrollPage pl= new PayrollPage(driver);
		pl.getPayrollBtn().click();
		pl.searchByEmpInfo(1);
		pl.getSearchEmpDetails().sendKeys(empName);
		pl.getEditBtn().click();
		pl.getBasic_VDA().clear();
		pl.getBasic_VDA().sendKeys("35000");
		pl.getStat_Bonus().clear();
		pl.getStat_Bonus().sendKeys("3000");
		pl.getPF().clear();
		pl.getPF().sendKeys("2000");
		String text = pl.getNetPay().getText();
		System.out.println(text);
		Thread.sleep(3000);
		pl.getCancelBtn().click();
	}
}
