package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// http://leaftaps.com/opentaps/control/main

		// 1 Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2 Enter the username and passowrd and login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// 5 Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// 6 Click Leads link and find leads

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		// 8 Click on Email
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();

		// 9 Enter Email
		driver.findElement(By.xpath("(//label[text()='Email Address:']/following::input)[1]"))
				.sendKeys("Testout@gmail.com");

		// 10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(8000);

		// 11 Capture name of First Resulting lead and Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String CompanyNameBeforeDuplicate = driver
				.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();
		String BeforeDuplicate = CompanyNameBeforeDuplicate.replaceAll("[^a-zA-Z]", "");
		System.out.println(BeforeDuplicate);

		// 13 Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()[normalize-space()='Qualify Lead']]/preceding-sibling::a")).click();

		// 14 Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();

		if (title.contains("Duplicate Lead")) {
			System.out.println(title + " is verified and displaying as expected");
		} else {
			System.out.println(title + " is verified and It is FAILED");
		}

		// 15 Click Create Lead
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String CompanyNameAfterDuplicate = driver.findElement(By.xpath("//span[text()='Company Name']/following::span"))
				.getText();
		String AfterDuplicate = CompanyNameAfterDuplicate.replaceAll("[^a-zA-Z]", "");
		System.out.println(AfterDuplicate);

		// 16 Confirm the duplicated lead name is same as captured name
		if (BeforeDuplicate.equals(AfterDuplicate)) {
			System.out.println(AfterDuplicate + " -Both the Leads have same Lead Name- PASSED");
		} else {
			System.out.println("It is FAILED");
		}

		// 17 Close the browser (Do not log out)
		driver.close();
		System.out.println("Assignment 02.3- Duplicate Lead has been completed successfully");

	}

}
