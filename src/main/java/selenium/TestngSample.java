package selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngSample {
	public  ChromeDriver	driver;
	@Test
	 public void loginPage() throws InterruptedException {
		 
		 	 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.leafground.com/table.xhtml;jsessionid=node013owd1atu85mvm3sjm0p10s84483342.node0");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 
				Thread.sleep(5000);
				driver.close();
		  
	       }  
}
