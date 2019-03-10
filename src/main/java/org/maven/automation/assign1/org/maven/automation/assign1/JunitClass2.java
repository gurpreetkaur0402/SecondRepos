package org.maven.automation.assign1.org.maven.automation.assign1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitClass2 {

	@Before
	public void bM()
	{
		System.out.println("Thisis before method");
	}
	@After
		public void aM()
	{
	 System.out.println("This is after method");
	 	
	}
	@BeforeClass
	  public static void bMClass()
	{
		System.out.println("This is before class");
	}
	
	@AfterClass
	  public static void aMClass()
	{
		System.out.println("This is After class");
	}
	
	@Test
	public void m1()
	{
		System.out.println("This is method 1");
		
	}
	
	@Test
	public void m2()
	{
		System.out.println("This is method2");
	}
}

