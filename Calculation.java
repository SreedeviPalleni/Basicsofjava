package sree.maven;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class Calculation {

	@Test
	public void test() {
		int a=3;
		int b=4;
		int c=a+b;
		assertEquals(c,7);
		System.out.println("inside the test case");
	}
	@Test
	public void test1() {
		int c=5;
		int d=4;
		int  sub=c-d;
		assertEquals(sub,1);
		System.out.println("inside the case");
	}
	@Test
	public void test2() {
	int e=2;
	int f=3;
	int mul=e*f;
	assertEquals(mul,6);
	System.out.println("inside the case");
	}
	@BeforeClass
	public static void test3() {
		System.out.println("hello");
		System.out.println("inside the class");
	}

@AfterClass
public static void test4() {
	System.out.println("world");
	System.out.println("inside the class");
}
	
	
	
}
	
	

	


