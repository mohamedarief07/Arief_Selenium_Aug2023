package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

			
		 try {
	            // 1. Open the MakeMyTrip website.
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	            // 2. Close the Sweet Alert.
				driver.findElement(By.className("commonModal__close")).click();

	            // 3. Click on the website logo.
				driver.findElement(By.xpath("//img[@alt='Make My Trip']")).click();

	            // 4. Navigate to the "Holiday Packages" section.
	            WebElement holidayPackages = driver.findElement(By.linkText("Holiday Packages"));
	            holidayPackages.click();

	            Thread.sleep(4000);	
	   driver.findElement(By.xpath("//div[text()='Filters']")).click();
	   
	   WebElement filtrFront = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1']"));
	   WebElement filtrback = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-2']"));
	   
	   Actions builder =new Actions(driver);
	   builder.dragAndDropBy(filtrFront, 50, 0).perform();
	   builder.dragAndDropBy(filtrback, -200, 0).perform();
	   
	   
	  
	            
	           

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // 18. Close the web browser.
	            //driver.quit();
	        }
	    }
	
		

	}


