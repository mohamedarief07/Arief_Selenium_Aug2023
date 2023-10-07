package week6.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node01h35uyr1ffslg92fwhv56yasa499013.node0");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		
		 List<WebElement> row = table.findElements(By.tagName("tr"));
		 int rowSize = row.size();
		 System.out.println("rowSize  :"+rowSize);
		 
		 List<WebElement> col = row.get(1).findElements(By.tagName("td"));
		 int colSize = col.size();
		 System.out.println("colSize  :"+colSize);
		 
		 for (int i = 0; i <rowSize; i++) {
			 WebElement eachRow = row.get(i);
			 List<WebElement> colElement = eachRow.findElements(By.tagName("td"));
			 for (int j = 0; j <colSize; j++) {
				 String text = colElement.get(j).getText();
				 System.out.println(text);
			}
	
		}

	}}