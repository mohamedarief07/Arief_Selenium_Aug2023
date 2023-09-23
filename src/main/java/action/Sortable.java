package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Sortable extends ProjectSpecificMethodj {

	@Test
	public void draggableTestCase01() throws InterruptedException {
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		
		WebElement firstElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement secondElement = driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement thirdElement = driver.findElement(By.xpath("//li[text()='Item 3']"));

		Actions builder=new Actions(driver);
		builder.dragAndDrop(secondElement, thirdElement).pause(3000).dragAndDrop(thirdElement, firstElement)
		.pause(3000).perform();

		
	}

}
