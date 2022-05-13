package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws Exception
	{

		   //open browser
		   WebDriverManager.chromedriver().setup();
		   RemoteWebDriver driver=new ChromeDriver();
	       //launch site
	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		   Thread.sleep(5000);//waiting time to load complete page
		   driver.switchTo().frame("iframeResult");
		   driver.findElement(By.name("fname")).sendKeys("abdul");
		   driver.findElement(By.name("lname")).sendKeys("kalam");
		   driver.findElement(By.xpath("//input[@value='Submit']")).submit();

	}

}
