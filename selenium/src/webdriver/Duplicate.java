package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate {
	WebDriver driver;
	public void  browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}
	public static void main(String[] args) {
		Duplicate d=new Duplicate();
		d.browser();

}
}