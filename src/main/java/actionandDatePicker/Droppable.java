package actionandDatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Droppable extends ProjectSpecificMethodj {

	@Test
	public void draggableTestCase01() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		
		WebElement dragMe = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dropME = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(dragMe, dropME).perform();
		
	}

}
