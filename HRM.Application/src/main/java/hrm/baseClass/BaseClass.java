package hrm.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import hrm.fileUtility.ExcelUtility;
import hrm.fileUtility.FileUtility;
import hrm.genericDataBaseUtility.DataBaseUtility;
import hrm.objectRepositoryUtility.HomePage;
import hrm.objectRepositoryUtility.LoginPage;
import hrm.webdriverUtility.JavaUtility;
import hrm.webdriverUtility.UtilityClassObject;
import hrm.webdriverUtility.UtilityClassObject;
import hrm.webdriverUtility.WebDriverUtility;
public class BaseClass {
	/* create Object */
	public DataBaseUtility dLib = new DataBaseUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(groups = { "smokeTest", "regressionTest" })
	public void configBS() {
		System.out.println("===connect to DB, Report Config===");
		dLib.getDbconnection();

	}


	@BeforeClass(groups = { "smokeTest", "regressionTest" })
	public void configBC() throws Throwable {
		System.out.println("===Launch the Browser===");
		//String BROWSER =fLib.getDataFromPropertiesFile("browser");
		String BROWSER= System.getProperty("browser", fLib.getDataFromPropertiesFile("browser"));
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		sdriver=driver;
		UtilityClassObject.setdriver(driver);
	}

	@BeforeMethod(groups = { "smokeTest", "regressionTest" })
	public void configBM() throws Throwable {
		System.out.println("===Login===");
		LoginPage lp = new LoginPage(driver);

		String URL= System.getProperty("url", fLib.getDataFromPropertiesFile("url"));
		String USERNAME= System.getProperty("username", fLib.getDataFromPropertiesFile("username"));
		String PASSWORD= System.getProperty("password", fLib.getDataFromPropertiesFile("password"));
		lp.loginToApp(URL, USERNAME, PASSWORD);
	}

	@AfterMethod(groups = { "somkeTest", "regressionTest" })
	public void configAM() {
		HomePage hp = new HomePage(driver);
		hp.logout();
		System.out.println("===Logout===");
	}

	@AfterClass(groups = { "smokeTest", "regressionTest" })
	public void configAC() {
		System.out.println("===Close the Browser===");
		driver.quit();
	}

	@AfterSuite(groups = { "smokeTest", "regressionTest" })
	public void configAS() {
		System.out.println("===Close To DB, Report Backup===");
		dLib.closeDbconnection();
		
	}
}
