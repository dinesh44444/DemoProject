package pakage1;

import java.util.ArrayList;
import java.util.Iterator; 
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php ");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(2000);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList <String> tabs = new ArrayList <String> (allwindows);
		
		driver.switchTo().window(tabs.get(2));

		
		
//		driver.switchTo().frame(1);
//		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
//		
//		driver.switchTo().frame(2);
		
		Alert a = driver.switchTo().alert();
		
		a.accept();  //----------->OK
		a.dismiss(); //----------->Cancel
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> s = driver.getWindowHandles();//-------------> store new windows address 
//		
//		Iterator<String> it = s.iterator();       //-------------> use this interface for traversing bcoz it contains some methodes with we have to use
//		
//		it.next();							   	 // -------------> Method of iterator (1st window)
//		
//		String w2nd = it.next();				 // -------------> for traversibg to 2nd windiow
//		
//		driver.switchTo().window(w2nd);			 // -------------> to switch to 2nd window
//		
//		Thread.sleep(2000);
		
		driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
			
		
	}

}
