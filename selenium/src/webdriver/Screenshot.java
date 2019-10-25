package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
	}

}
