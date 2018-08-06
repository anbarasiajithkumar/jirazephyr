package jirazephyrpaxk;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jira {
@Test
public void zephyrtesting() throws InterruptedException
	{
		System.out.println(" Testcase Executing...");
		System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
	driver.navigate().to("https://google.com");
	Assert.assertEquals("Google", driver.getTitle());
	driver.close();
	}

}
