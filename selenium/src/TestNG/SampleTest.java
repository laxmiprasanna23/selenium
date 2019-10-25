package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class SampleTest {
  @Test
  public void f() {
	  System.out.println("hi");
  }
  @BeforeTest
  public void object() {
	  System.out.println("hello");
  }
  @AfterClass
  public void function() {
  System.out.println("bonjour");
}
}
