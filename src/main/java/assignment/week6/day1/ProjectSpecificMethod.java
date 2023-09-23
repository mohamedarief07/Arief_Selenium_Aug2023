package assignment.week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	public ChromeOptions options;
	public String excelFilePath;
	public String sheetName;

	@Parameters({"URL","browser","username","password"})
	@BeforeMethod
	public void preCondition(String url,String browser, String uname, String pword ) {
		if (browser.equalsIgnoreCase("chrome")) {
			options = new ChromeOptions();
			options.setBinary("116");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
	@DataProvider (name="dyno01")
	public String[][] sendData() throws IOException {

		
		
		return ReadExcel.getExcelData(excelFilePath,sheetName);
	}


}
