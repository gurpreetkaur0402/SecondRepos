package org.maven.automation.assign1.org.maven.automation.assign1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNGunitClass1 {


	@BeforeClass
	public void beforeClass() {
		System.out.println("This is JunitClass1, Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is AfterClass");

	}

	@BeforeMethod
	public void before() {

		System.out.println("This is before method");

	}

	@AfterMethod
	public void after() {
		System.out.println("After method is executed");
	}

	@Test // @Test is annotation which is mandatory to execute test method
	public void t1() {
		System.out.println("Hello t1");
	}

	@Test

	public void t2() {
		System.out.println("hello t2");

	}

	@Test
	public void t3() {
		System.out.println("Hello t3");
	}

	@Test
	public void t4() {
		System.out.println("Hello t4");
	}

	@Test
	public void t5() {
		System.out.println("Hello t5");
	}

}

