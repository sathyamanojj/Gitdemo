package TestNG2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2Test {
	public static void main(String args[])
	{
		//merge1();
		merge2();
	}
  @BeforeMethod
  public static void merge2() 
  {
    System.out.println("get merged with 1");
  }
}

