package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg6 {

	@Test
	public void z() {
		Assert.assertTrue(3 < 12);
		System.out.println("Hello z test method");
	}

	@Test
	public void a() {
		Assert.assertTrue(3 > 12);
		System.out.println("Hello z test method");
	}

	@Test(dependsOnMethods = { "z", "a" })
	public void b() {
		Assert.assertTrue(3 > 12);
		System.out.println("Hello z test method");
	}
}
