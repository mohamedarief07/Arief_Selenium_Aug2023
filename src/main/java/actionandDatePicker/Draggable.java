package actionandDatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable extends ProjectSpecificMethodj {

	@Test
	public void draggableTestCase01() throws InterruptedException {
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame(0);

		WebElement dragMe = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		Point location = dragMe.getLocation();
		int x = location.x;
		int y = location.y;

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragMe, x + 50, y + 60).pause(4000).perform();
	

	}

}
