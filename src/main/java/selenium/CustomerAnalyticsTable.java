package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomerAnalyticsTable {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node013owd1atu85mvm3sjm0p10s84483342.node0");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowSize = rows.size();
		System.out.println(rowSize);

		List<WebElement> Colms = rows.get(1).findElements(By.tagName("td"));
		int colSize = Colms.size();
		System.out.println(colSize);

		for (int i = 1; i < rowSize; i++) {
			WebElement eachRow = rows.get(i);
			List<WebElement> eachCols = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < colSize; j++) {
				if (eachCols.get(4).getText().equals("QUALIFIED")) {
					String joinDate = eachCols.get(j).getText();
					System.out.println(joinDate);
				
				}

			}
		}
		Thread.sleep(3000);
		// driver.close();

	}

}
