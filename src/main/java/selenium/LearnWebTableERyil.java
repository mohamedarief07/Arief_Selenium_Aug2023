package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTableERyil {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("TPJ", Keys.TAB);

		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS", Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		WebElement baseTable = driver
				.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));

		List<WebElement> rows = baseTable.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("Row size : " + rowsize);

		List<WebElement> colms = rows.get(1).findElements(By.tagName("td"));

		int colsize = colms.size();
		System.out.println("Column size : " + colsize);

		for (int i = 1; i < rowsize; i++) {
			WebElement eachRow = rows.get(i);
			List<WebElement> eachCol = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < colsize; j++) {
				String text = eachCol.get(j).getText();
				System.out.println(text);
			}

		}
		
		System.out.println("=======================================================================================");

		for (int i = 1; i < rowsize; i++) {
			WebElement eachrows = rows.get(i);
			List<WebElement> eachcolls = eachrows.findElements(By.tagName("td"));
			for (int j = 0; j < colsize; j++) {
				if (eachcolls.get(1).getText().contains("CHENNAI")) {
					String trainNo = eachcolls.get(0).getText();
					String trainName = eachcolls.get(1).getText();
					System.out.println(trainNo + "---> " + trainName);
					break;

				}

			}

		}

		Thread.sleep(3000);
		driver.close();
	}

}
