package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);

		String title2 = driver.getTitle();
		System.out.println(title2);

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Arief Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arief");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");

		// Source
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropDown);
		dd.selectByIndex(1);

		// Marketing Campaign
		WebElement dropDownMarketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(dropDownMarketing);
		dd2.selectByValue("CATRQ_AUTOMOBILE");

		// Industry
		WebElement dropDownIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd3 = new Select(dropDownIndustry);
		dd3.selectByVisibleText("Non-profit");

		driver.findElement(By.name("submitButton")).click();
		// driver.close();

	}

}
