package sree.maven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_4Annotation_Examples {

	@Test
	public void test() {
		System.out.println("test1");
	}
		
		@Ignore("Not yet implemented")
		@Test
	public void test2()
	{
			System.out.println("test2");
	}
		@BeforeClass
		public static void beforeClassMethod() {
			System.out.println("Before Class Method(connect DB)");
		}
    @AfterClass
  public static void afterClassMethod() {
    	System.out.println("After Class Method(Dissconnet DB)");
	   }
    @After
    public void afterMethod() {
    	System.out.println("After annotation Method(refresh web page)");
    }
    @Before
    public void beforeMethod() {
    	System.out.println("Before annotation Method(refresh web page)");
    }
    @Test(expected =ArithmeticException.class)
	public void testException() {
		int a=10/0;
	}
    @Test(timeout=500)
	public void timeOut() {
		int a=0;
	}


}
