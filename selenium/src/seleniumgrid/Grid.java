package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Grid {
	WebDriver driver;
	
String baseUrl,nodeUrl;

public void setup () 
  {
	/*baseUrl is an application url*/
	 baseUrl="http://www.fb.com";
	 /*nodeUrl is an client registred url contains client port number */
	 nodeUrl="http://192.168.0.178:4444/wd/hub";

	 /*browser capability intitialization using Desiredcapabilities class*/
	 DesiredCapabilities capability = DesiredCapabilities.firefox();
	 capability.setBrowserName("firefox"); // browser name declaration
	 capability.setPlatform(Platform.WINDOWS); // operating system name declaration
	 try {
/* Remotewebdriver is a class to specify client registered URL using capabilities*/
 /* Remotewebdriver class returns MalformedURLException when declared new URL method */
		 driver=new RemoteWebDriver(new URL(nodeUrl),capability);
					
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	// Thread.sleep(10000);
	 }

public void simpletest() {
  driver.get(baseUrl);
  Assert.assertEquals("Facebook � log in or sign up",driver.getTitle());
  
}

	public static void main(String[] args)throws Exception, Exception {
		Grid s=new Grid();
		s.setup();
		s.simpletest();
		
		
	}

	}


