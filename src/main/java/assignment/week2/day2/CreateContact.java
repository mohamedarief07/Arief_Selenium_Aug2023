package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"		 * 
		 * 2. Enter UserName and Password Using Id Locator		 * 
		 * 3. Click on Login Button using Class Locator		 * 
		 * 4. Click on CRM/SFA Link		 * 
		 * 5. Click on contacts Button		 * 
		 * 6. Click on Create Contact		 *  
		 * 7. Enter FirstName Field Using id Locator		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 	* 9. Enter FirstName(Local) Field Using id Locator		 * 
		 * 10. Enter LastName(Local) Field Using id Locator		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice		 * 
		 * 12. Enter Description Field Using any Locator of your choice 		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice		 * 
		 * 14. Select State/Province as NewYork Using Visible Text		 * 
		 * 15. Click on Create Contact		 * 
		 * 16. Click on edit button 		 * 
		 * 17. Clear the Description Field using .clear		 * 
		 * 18. Fill ImportantNote Field with Any text		 * 
		 * 19. Click on update button using Xpath locator		 * 
		 * 20. Get the Title of Resulting Page.
         */
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Arief");
		driver.findElement(By.id("lastNameField")).sendKeys("Khan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Thala");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ariee");
		driver.findElement(By.name("description")).sendKeys("A grammatical unit that is syntactically independent and has a subject that is expressed or, as in imperative sentences, understood and a predicate that contains at least one finite verb");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Demosalesmanager@test.com");

		// State/Province
		WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(dropDown);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated row");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = driver.getTitle();		
		System.out.println("The Title of Resulting Page is " + title);
		
		if(title.contains("View Contact")) {
			System.out.println("This case is PASSED");
		}else
		{
			System.out.println("This case is FAILED");
		}
		driver.close();	
		
		System.out.println("Assignment 02.1- Create Contact has been completed successfully");
	
		
		
		
		
		
		
	}

}