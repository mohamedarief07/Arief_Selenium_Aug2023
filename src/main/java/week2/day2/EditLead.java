package week2.day2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class EditLead {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'First name:')])[3]/parent::div/div/input")).sendKeys("Test");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				
		String checkTitle = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println("The Title of the screen is :" +checkTitle);	
		
		if(checkTitle.contains("View Lead")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String text2 = driver.findElement(By.xpath("(//span[@id='viewLead_companyName_sp'])")).getText();
		System.out.println("Newly updated Company Name :" +text2);	
		if(text2.contains("Google")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		driver.close();	
		
		System.out.println("Assignment 02.2 has been completed successfully");
	
		

	}
}

