package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	    
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
		* 
		* 
*/
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Subhash");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		String title = driver.getTitle();		

		if(title.contains("View Contact")) {
			System.out.println(title+ " is verified and displaying as expected");
		}else
		{
			System.out.println(title+ " is verified and It is FAILED");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Arief Private Limited");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		String text2 = driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();
		
		System.out.println("Newly updated Company Name :" +text2);	
		if(text2.contains("Arief Private Limited")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		driver.close();	
		
		System.out.println("Assignment 02.2- Edit Lead has been completed successfully");
	
}

}	
