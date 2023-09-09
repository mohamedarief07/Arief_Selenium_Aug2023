package practice.javaprograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicXpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("115");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		// AbsoluteXpath
		WebElement AbsoluteXpath = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/input"));
		AbsoluteXpath.sendKeys("Absolute Xpath");
		Thread.sleep(5000);
		AbsoluteXpath.clear();

		// Basic Xpath
		// Attribute Based
		WebElement AttributeBased = driver.findElement(By.xpath("//input[@id='username']"));
		AttributeBased.sendKeys("Attribute Based");
		Thread.sleep(5000);
		AttributeBased.clear();

		// Partial Attribute Based
		WebElement PartialAttributeBased = driver.findElement(By.xpath("//input[contains(@id,'name')]"));
		PartialAttributeBased.sendKeys("Partial Attribute Based");
		Thread.sleep(5000);
		PartialAttributeBased.clear();

		// Text Based
		WebElement TextBased = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']"));
		String text = TextBased.getText();
		System.out.println("Text Based xpath :" +text);

		// Partial Text Based
		WebElement PartialTextBased = driver.findElement(By.xpath("//h2[contains(text(),'Login')]"));
		String text1 = PartialTextBased.getText();
		System.out.println("Partial Text Based xpath :" +text1);

		// Collection Based Xpath
		WebElement ColectionBasedXpath1 = driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]"));
		ColectionBasedXpath1.sendKeys("ColectionBasedXpath1");
		WebElement ColectionBasedXpath2 = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		ColectionBasedXpath2.sendKeys("ColectionBasedXpath2");
		Thread.sleep(5000);
		ColectionBasedXpath1.clear();
		ColectionBasedXpath2.clear();

		// Axes Xpath
		// Parent To child
		WebElement ParentTochild = driver.findElement(By.xpath("//p[@class='top']/input"));
		ParentTochild.sendKeys("Parent To child");
		Thread.sleep(5000);
		ParentTochild.clear();

		// child to Parent
		WebElement childToParent = driver.findElement(By.xpath("//input[@id='username']/.."));
		String attribute = childToParent.getText();
		System.out.println("child to Parent xpath :" +attribute);
		

		//GrandParent to child Relation
		WebElement GrandParentTochild = driver.findElement(By.xpath("//form[@id='login']//input[@id='username']"));
		GrandParentTochild.sendKeys("Grand Parent to child Relation");
		Thread.sleep(5000);
		GrandParentTochild.clear();

		// GrandChild to Grand parent
		WebElement GrandChildToParent = driver.findElement(By.xpath("//input[@id='username']/ancestor::form"));
		String attribute1 = GrandChildToParent.getText();
		System.out.println("Grand Child to Grand parent :" +attribute1);
		
		//Elder Sibling to Younger Sibling
		WebElement ElderSiblingToYounger = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input[@id='username']"));
		ElderSiblingToYounger.sendKeys("Elder Sibling to Younger Sibling");
		Thread.sleep(5000);
		ElderSiblingToYounger.clear();
		
		// Younger Sibling to elder Sibling
		WebElement YoungerSiblingToElder = driver.findElement(By.xpath("//input[@id='password']/preceding-sibling::label[text()='Password']"));
		String text2 = YoungerSiblingToElder.getText();
		System.out.println(" Younger Sibling to elder Sibling :" +text2);
		
		WebElement elderCousinToYounger = driver.findElement(By.xpath("//label[text()='Username']/following::input[2]"));
		elderCousinToYounger.sendKeys("Elder cousin to Younger cousin");
		Thread.sleep(5000);
		elderCousinToYounger.clear();
		
		// Younger Sibling to elder Sibling
		WebElement YoungerCousinToElder = driver.findElement(By.xpath("//label[text()='Password']/preceding::input[@id='username']"));
		YoungerCousinToElder.sendKeys("Elder cousin to Younger cousin");
		Thread.sleep(5000);
		YoungerCousinToElder.clear();
		
		Thread.sleep(3000);
		driver.close();

	}
}
