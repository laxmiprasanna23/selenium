package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sampletest1 {
  @Test(priority=0)
  public void f() {
	  System.out.println("hi");
  }
  
  @BeforeTest 
  public void method() {
	  System.out.println("hello"); 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("bonjour");
  }

}
