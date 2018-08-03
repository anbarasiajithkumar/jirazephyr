package jirazephyrpaxk;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jira {
@Test
public void zephyrtesting() throws InterruptedException
	{
		System.out.println(" Welcome to my world");
		System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://teammigrate:18080/#/user/login");
driver.manage().window().maximize();
String aTitle ="eDriver Client Application";
String a=driver.getTitle();
if (aTitle.contentEquals(a))
{
	System.out.println("Test failed");
}
	driver.findElement(By.id("userName")).sendKeys("hprasad");
	driver.findElement(By.id("password")).sendKeys("Test@123");
	driver.findElement(By.cssSelector(".btn.btn-login")).click();
	Thread.sleep(3000);
System.out.println("Test Passed.");	
}

}
