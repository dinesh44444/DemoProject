package pakage1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshot_Demo {

	public static void main(String[] args) throws IOException {
		
		
	//set Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
	//Launch Browser	
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com");
		
		//Typecast/Downcast
		
		TakesScreenshot ts =((TakesScreenshot)driver);
		
		File s = ts.getScreenshotAs(OutputType.FILE);
		
		File d=new File ("C:\\Users\\user\\Desktop\\a\\screenshot.jpeg");
		
		Files.copy(s, d);
		
		
	}

}
