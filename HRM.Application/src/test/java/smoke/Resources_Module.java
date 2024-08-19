package smoke;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.testng.annotations.Test;

import hrm.baseClass.BaseClass;
import hrm.objectRepositoryUtility.ResourcesPage;

public class Resources_Module extends BaseClass
	
{
	String ex=".crdownload";
@Test
public void resources_Download_Add() throws Throwable {
	ResourcesPage rp=new ResourcesPage(driver);
	rp.getResourceBtn().click();
	rp.selectFile(0);
	String fname="SHINY INGRID C.pdf";
	rp.getSearchBar().sendKeys(fname);
	rp.getDownloadBtn().click();
	
	Thread.sleep(6000);
	File f=new File("‪C:\\Users\\Dell\\Downloads\\"+fname+ex);
	
	System.out.println(f.exists());
	
}
}
