import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//*[@name='Submit']")).click();
		   driver.findElement(By.xpath("//*[contains(text(), 'Welcome Paul')]")).click();
		   driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).click();
		   

	}

}
