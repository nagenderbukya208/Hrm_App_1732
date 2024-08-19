package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.SettingsPage;

public class Set_Payroll_Cre extends BaseClass{
	@Test
	public void settings_Btn() throws InterruptedException {
		SettingsPage sp= new SettingsPage(driver);
		sp.getPayrollCreateCheckbox().click();
}
}
