package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception
	{
		//open browser
		 WebDriverManager.chromedriver().setup();
		 RemoteWebDriver driver=new ChromeDriver();
		//launch site
		 driver.get("https://www.flipkart.com");
		 Thread.sleep(5000);
		 // element cover by other element like banner
		 // but sendKeys() is working successfully
		 driver.findElement(By.name("identifier")).sendKeys("mobiles",Keys.ENTER);
		 Thread.sleep(5000);
		// clear that value using clear() method
		 // it will work successfully. otherwise we go to keyboard keys automation
		 driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,Keys.ESCAPE);
		 Thread.sleep(5000);


	}

}
