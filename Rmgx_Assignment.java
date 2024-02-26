package selenium_playground;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Rmgx_Assignment {
	
	@Test
	public void finding_links() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Nexus 6')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.partialLinkText("Home")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(5000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.partialLinkText("Home")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(5000);
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		
		String total=driver.findElement(By.xpath("//h3[@id='totalp']")).getText();
		Assert.assertEquals("1830","1830");
		//deleting the nexus 6 from the cart
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).click();
		
		String totalAfterdelete=driver.findElement(By.xpath("//h3[@id='totalp']")).getText();
		Assert.assertEquals("1180","1180");
		driver.quit();
	}

	
	}
	



