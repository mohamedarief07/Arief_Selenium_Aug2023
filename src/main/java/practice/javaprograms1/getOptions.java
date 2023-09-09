package practice.javaprograms1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/dropdowns");

		driver.manage().window().maximize();
		
		//For loop
		WebElement heros = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select allHeros = new Select(heros);
		List<WebElement> allOption = allHeros.getOptions();
		for (int i = 0; i < allOption.size(); i++) {
			System.out.println(allOption.get(i).getText());
		}
		
		//forEach
		WebElement herosss = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select allHerosss=new Select(herosss);
		List<WebElement> allOptionss = allHerosss.getOptions();
		allOptionss.forEach(i->System.out.println(i.getText()));

		//forEach
		WebElement heross = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select allHeross = new Select(heross);
		List<WebElement> allOptions = allHeross.getOptions();
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}

		Thread.sleep(3000);
		driver.close();

	}

}
