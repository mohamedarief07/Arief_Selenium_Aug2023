package selnium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSampleCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
