package TestNG;

import org.testng.annotations.*;

public class TestNg1 {
	
	@Test
	public void a2() {
		System.out.println("Heloo a2 method");
	}
	@BeforeTest
	public void b() {
		System.out.println("Heloo b method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Heloo c method");
	}
	@AfterMethod
	public void d() {
		System.out.println("Heloo d method");
	}
	@BeforeClass
	public void e() {
		System.out.println("Heloo e method");
	}
	
	@AfterTest
	public void f() {
		System.out.println("Heloo f method");
	}
	@AfterClass
	public void g() {
		System.out.println("Heloo g method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("Heloo h method");
	}
	@AfterSuite
	public void i() {
		System.out.println("Hello i method");
	}
	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
		
	}
	@Test
	public void A1() {
		System.out.println("Hello A1 test method");
		
	}
	public static void main(String[] args) {
		System.out.println("Hello Java");
	}

}
