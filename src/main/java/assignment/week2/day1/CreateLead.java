package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
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
			System.out.println("Create Lead Test Case is PASSED");
			
		}else {
			System.out.println("Create Lead Test Case is FAIELD");
		}

	}

}
