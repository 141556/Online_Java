package TestNG;

import org.testng.annotations.Test;

public class TestNg7 {

	@Test(groups = "Regression")
	public void a() {
		System.out.println("Regression a Test method ");
	}

	@Test(groups = "Regression")
	public void b() {
		System.out.println("Regression b Test method");
	}

	@Test(groups = "Regression")
	public void c() {
		System.out.println("Regression c Test method");
	}

	@Test(groups = { "Regression", "Sanity" })
	public void d() {
		System.out.println("Regression and sanity d Test method");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void e() {
		System.out.println("Regression and smoke e Test method");
	}

}
