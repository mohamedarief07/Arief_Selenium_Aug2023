package assignment.week2.day1;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class CreateLeadFaker {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Locale locale = Locale.ENGLISH;
		Faker fake = new Faker(locale);
		String firstName = fake.name().firstName();
		String companyName = fake.name().fullName();
		String lastName = fake.name().lastName();
		
		Date birthday = fake.date().birthday();
		SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
		String age = sd.format(birthday);
		
		
		String emailAddress = fake.internet().emailAddress();
		String description = fake.name().nameWithMiddle();
		String cellPhone = fake.phoneNumber().cellPhone();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys(age);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(emailAddress);
		driver.findElement(By.name("description")).sendKeys(description);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(cellPhone);


		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateProvince);
		dd.selectByVisibleText("New York");
		
		Thread.sleep(5000);

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println("Title of Resulting Page is " + title);

		if (title.contains("View Lead")) {
			System.out.println("Create Lead Test Case is PASSED");

		} else {
			System.out.println("Create Lead Test Case is FAIELD");
		}

	}

}
