package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNg4 {

//	@Test - 1st way to do not execute test case
	public void a() {
		System.out.println("Hello a test method");
	}

//	widely used in market
	@Test(enabled = false)
	public void b() {
		System.out.println("Hello b test method");
	}
	@Test(enabled = true)
	public void c() {
		System.out.println("Hello c test method");
	}
//	Rerun script 2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("Hello d test method");
	}
	
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("Hello e test method");
	}
//	Conditional Skipping
	@Test
	public void f() {
		System.out.println("Hello f test method");
		throw new SkipException("Skipped f test method");
	}
}
