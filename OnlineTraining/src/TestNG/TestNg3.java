package TestNG;

import org.testng.annotations.Test;

public class TestNg3 {
	
	@Test(priority = -10)
	public void a1() {
		System.out.println("Hello a1 test method");
	}
	@Test(priority = 2)
	public void a2() {
		System.out.println("Hello a1 test method");
	}
	@Test(priority = 0)
	public void a3() {
		System.out.println("Hello a1 test method");
	}
	@Test
	public void a4() {
		System.out.println("Hello a1 test method");
	}

}
