package jirazephyrpaxk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jira2
{
	@Test
	public  void zephyrtestingtwo()
	{
	System.out.println(" Welcome to my world");
	System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("http://teammigrate:18080/#/user/loginn");
driver.manage().window().maximize();
String a=driver.getTitle();
String aTitle ="testing1";

if (aTitle.contentEquals(a))
{
System.out.println("Test failed");
}
}
}