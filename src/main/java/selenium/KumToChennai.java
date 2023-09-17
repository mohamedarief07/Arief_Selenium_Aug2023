package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class KumToChennai {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// LOGIN
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://sdk.irctc.corover.ai/askdisha-bucket/IRCTC-banner-1.gif']/preceding::img[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("");
		driver.findElement(By.id("captcha")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		Thread.sleep(10000);

		// HomeScreen
		WebElement kmu = driver.findElement(By.xpath("//label[text()=' BOOK TICKET ']/following::input"));
		kmu.sendKeys("KMU");
		driver.findElement(By.xpath("//span[text()=' KUMBAKONAM - KMU ']")).click();

		WebElement crlm = driver.findElement(By.xpath("//label[text()='From']/following::input"));
		crlm.sendKeys("TBM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' TAMBARAM - TBM ']")).click();

		driver.findElement(By.xpath("//label[text()='To']/following::input")).click();

		driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon pi')]")).click();

		driver.findElement(By.linkText("5")).click();

		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		Thread.sleep(10000);

		// Train Selecting screen
		driver.findElement(By.xpath("(//strong[text()='22:30 | ']/following::strong)[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@id='divMain']/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[2]/div[1]/app-train-avl-enq[1]/div[1]/div[7]/div[1]/div[3]/table[1]/tr[1]/td[2]/div[1]/div[1]/strong[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btnDefault train_Search')]")).click();
		Thread.sleep(5000);

		// Passenger Entry screen
		driver.findElement(By.xpath("//input[@placeholder='Passenger Name']")).sendKeys("Mohamed Arief M");
		driver.findElement(By.xpath("//input[@formcontrolname='passengerAge']")).sendKeys("32");

		// Select the Gender
		Select gender = new Select(driver.findElement(By.xpath("//select[@formcontrolname='passengerGender']")));
		gender.selectByVisibleText("Male");

		// Select the Preference
		Select preference = new Select(
				driver.findElement(By.xpath("//select[@formcontrolname='passengerBerthChoice']")));
		preference.selectByVisibleText("Lower");

		driver.findElement(By.xpath("(//div[@role='radio']//span)[2]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Fare Summary Screen
		//driver.findElement(By.xpath("//input[@formcontrolname='captcha']")).click();
		Thread.sleep(14000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Payment Method Screen
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='BHIM/ UPI/ USSD']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Pay using BHIM (Powered by PAYTM ) also accepts UPI ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Pay & Book '])[2]")).click();

	}
}
