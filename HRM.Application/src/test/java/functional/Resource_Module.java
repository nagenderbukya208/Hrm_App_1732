package functional;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ResourcesPage;

public class Resource_Module {
	public class Resources_Module extends BaseClass
	
	{
		String ex=".crdownload";
	@Test
	public void resources_Download_Add() throws Throwable {
		ResourcesPage rp=new ResourcesPage(driver);
		rp.getResourceBtn().click();
}
	}}
