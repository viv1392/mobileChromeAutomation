package baseComponent;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException {
		try {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("deviceName", "Android Device");
		caps.setCapability("automationName", "UIAutomator2");

		URL url=new URL("http://127.0.0.1:4723/");
		driver=new AppiumDriver(url,caps);
		}
		catch(Exception e){
			e.getCause();
			e.getMessage();
			e.getStackTrace();
			System.out.println(e);
			
		}
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://ketobalanced.com/");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
			
	}

}
