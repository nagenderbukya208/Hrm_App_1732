package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.SettingsPage;

public class Setting_Pro_Re extends BaseClass {
	@Test
	public void settings_Btn() throws InterruptedException {
		SettingsPage sp= new SettingsPage(driver);
		sp.getProjReadCheckBox().click();
		
		
}
}
