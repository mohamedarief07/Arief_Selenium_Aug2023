package actionandDatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnDatePicker {

	@Test
	public void pickTheDate() {

		String year = "2019";
		String month = "May";
		String date = "7";

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		WebElement datePicker = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']"));
		datePicker.click();

		driver.findElement(By.xpath("//th[@class='datepicker-switch']")).click();
		driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]")).click();

		WebElement baseTable = driver.findElement(By.xpath("(//table[@class='table-condensed'])[3]/tbody/tr/td"));

		// Year
		List<WebElement> allYear = baseTable
				.findElements(By.xpath("(//table[@class='table-condensed'])[3]/tbody/tr/td/span"));

		for (WebElement list : allYear) {
			String text = list.getText();

			if (list.getText().equalsIgnoreCase(year)) {
				if (list.isEnabled()) {
					list.click();
					break;

				} else {
					System.out.println("Year Not Enabled");
				}

			}
		}

		// Month
		List<WebElement> allMonth = baseTable
				.findElements(By.xpath("(//table[@class='table-condensed'])[2]/tbody/tr/td/span"));

		for (WebElement list1 : allMonth) {
			String text1 = list1.getText();

			if (list1.getText().equalsIgnoreCase(month)) {
				if (list1.isEnabled()) {
					list1.click();
					break;

				} else {
					System.out.println("Month Not Enabled");
				}

			}
		}

		// Month
		List<WebElement> allDate = baseTable
				.findElements(By.xpath("(//table[@class='table-condensed'])[1]/tbody/tr/following-sibling::tr/td"));

		for (WebElement list2 : allDate) {
			String text2 = list2.getText();

			System.out.println("Date :" + text2);
			if (text2.equalsIgnoreCase(date)) {
				if (list2.isEnabled()) {
					list2.click();
					break;

				} else {
					System.out.println("Month Not Enabled");
				}

			}
		}

	}

}
