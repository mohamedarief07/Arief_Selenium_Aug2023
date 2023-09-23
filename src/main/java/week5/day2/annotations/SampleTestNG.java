package week5.day2.annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	public ChromeDriver driver;
	public ChromeOptions options;
	
	@BeforeSuite
	public void startReport() {
		System.out.println("Before Suite");

	}
	
	@BeforeTest
	public void reportReady() {
		System.out.println("Before Test");

	}
	
	@BeforeClass
	public void testCaseDetails() {
		System.out.println("Before Class");

	}
	
	@BeforeGroups({"group1","group2"})
	public void beforeGroups() {
		System.out.println("Before Groups");

	}
	
		
	@BeforeMethod
	public void login() {
		System.out.println("Before Method");
		options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Test(groups="group1")	
	public void createLeadTestCase01() throws InterruptedException {
		System.out.println("test01");
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Arief Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arief");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Khan Mohd");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.name("description")).sendKeys(
				"Description is any type of communication that aims to make vivid a place, object, person, group, or other physical entity. Description is one of four rhetorical modes, along with exposition, argumentation, and narration");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");

		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateProvince);
		dd.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println("Title of Resulting Page is " + title);

		if (title.contains("View Lead")) {
			System.out.println("createLeadTestCase01--> Create Lead Test Case is PASSED");

		} else {
			System.out.println("Create Lead Test Case is FAIELD");
		}

	}
	
	@Test(groups="group2")	
	public void editLeadTestCase02() throws InterruptedException {
		System.out.println("test02");
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		String title = driver.getTitle();

		if (title.contains("View Contact")) {
			System.out.println(title + " is verified and displaying as expected");
		} else {
			System.out.println(title + " is verified and It is FAILED");
		}

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Arief Private Limited");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();

		String text2 = driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();

		System.out.println("Newly updated Company Name :" + text2);
		if (text2.contains("Arief Private Limited")) {
			System.out.println("editLeadTestCase02--> This case is PASSED");
		} else {
			System.out.println("This case is FAILED");
		}

		System.out.println("Assignment 02.2- Edit Lead has been completed successfully");

	}
	
	@AfterMethod
	public void takeScreenshots() {
		System.out.println("After Method");
	}
	
	
	@AfterClass
	public void close() {
		System.out.println("After Class");
		driver.close();

	}
	
	@AfterTest
	public void publishReport() {
		System.out.println("After Test");

	}
	
	@AfterSuite
	public void stopReport() {
		System.out.println("After Suite");

	}



}
