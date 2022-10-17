package pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverFunctions {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();

		
	//[1]
		WebElement ForgetText = driver.findElement(By.linkText("Forgotten password?"));
		
		String Text = ForgetText.getText(); 		//----------> for printing the text on consol
		
		System.out.println(Text);
		
		
	//[2]	
		
		WebElement Lognin_Button = driver.findElement(By.id("u_0_5_1g"));
		
		Boolean A = Lognin_Button.isEnabled();
		
		System.out.println(A);
		
		driver.close();
		
	//[isSelected]
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		WebElement redio_button = driver.findElement(By.id("vfb-7-1"));
		
		Boolean a = redio_button.isSelected();
		
		System.out.println(a);
		
	
	}

}
