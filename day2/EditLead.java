package assignment.week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod {

	@Test
	public void editLeadTestCase02() throws InterruptedException {

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

}
