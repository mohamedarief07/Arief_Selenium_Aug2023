package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser {
	
	public RemoteWebDriver driver;

	@Override
	public void StartApp() {
		driver=new ChromeDriver();
		
	}

	@Override
	public void StartApp(String Browser) {
		switch (Browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
			
		case "Edge":
			driver=new EdgeDriver();
			break;

		default:
			break;
		}
		
	}

}
