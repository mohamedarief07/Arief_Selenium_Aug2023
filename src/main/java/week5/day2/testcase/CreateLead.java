package week5.day2.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@Test(invocationCount = 6)
	public void createLeadTestCase01() throws InterruptedException {

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

}
