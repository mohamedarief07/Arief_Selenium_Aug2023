package LearnExcel;

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

	@Parameters({"URL","Browser-Name"})
	@BeforeMethod
	public void preCondition(String url, String browser) {
		
		
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	
	@DataProvider(name="dyno01")
	public String[][] testdata() throws IOException
	{
		String[][] data = ReadExcel.getData(excelFilePath,sheetName);
		return data;
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
