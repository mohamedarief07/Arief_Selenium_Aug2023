package selnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dedede {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser= "Edge";
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;

		default:
			driver = new FirefoxDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://platform.testleaf.com/#/");
		driver.close();


	}

}
