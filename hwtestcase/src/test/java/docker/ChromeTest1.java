package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {
	
	@Test
	public void test() throws MalformedURLException 
	{
		DesiredCapabilities dc=DesiredCapabilities.chrome();
				
		URL url=new URL("http://seleniumgrid.demoapps.ashnik-demo.com/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);	
		
		driver.get("http://helloworld.demoapps.ashnik-demo.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
