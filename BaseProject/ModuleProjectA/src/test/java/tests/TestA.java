package tests;

import org.junit.Test;

import pages.PageA;

public class TestA extends PageA{

	
	@Test
	public void testA() {
		System.out.println("Inside Test");
		pageA();
	}
}
