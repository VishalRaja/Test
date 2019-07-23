package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	static WebDriver driver;

	public static WebDriver startBrowser(String url)
	{
		

		
			System.setProperty("webdriver.chrome.driver", "C:\\vishal\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}