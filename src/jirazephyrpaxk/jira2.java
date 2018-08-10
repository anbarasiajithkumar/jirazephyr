package jirazephyrpaxk;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jira2
{
	@Test
	public  void zephyrtestingtwo() throws InterruptedException
	{
	System.out.println(" Executing SAF urls");
	System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("http://teammigrate:18080/#/user/login");
driver.manage().window().maximize();

String actualTitle = driver.getTitle();
String expectedTitle = "My Title";
assertEquals(actualTitle, expectedTitle);
driver.findElement(By.id("userName")).sendKeys("hprasad");
driver.findElement(By.id("password")).sendKeys("Test@123");
driver.findElement(By.cssSelector(".btn.btn-login")).click();
Thread.sleep(3000);
driver.close();
}
}