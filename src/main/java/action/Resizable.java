package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Resizable extends ProjectSpecificMethodj {

	@Test(invocationCount = 5)
	public void draggableTestCase01() throws InterruptedException {
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		
		WebElement click = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Point location = click.getLocation();
		int x = location.x;
		int y = location.y;
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(click, 100, 100).pause(3000).perform();
		
	}

}
