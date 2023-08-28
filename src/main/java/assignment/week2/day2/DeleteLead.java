package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

		// 8 Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

		// 9 Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");

		// 10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(8000);

		// 11 Capture lead ID of First Resulting lead
		String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
				.getText();

		// 12 Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				
		// 13 Click Delete
		driver.findElement(By.xpath("//a[text()[normalize-space()='Edit']]/following-sibling::a")).click();

		// 14 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// 15 Enter captured lead ID
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(LeadID);

		// 16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 17 Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion

		Thread.sleep(2000);
		String verifymessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if (verifymessage.contains("No records to display")) {
			System.out.println("confirms the successful deletion- This case is PASSED");
		} else {
			System.out.println("This case is FAILED");
		}

		// 18 Close the browser (Do not log out)
		driver.close();
		System.out.println("Assignment 02.4 has been completed successfully");
	}

}
