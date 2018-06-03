package com.bbc.MavenTestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest { 
	boolean tip = true;
	@Test
	public void test2() {
		System.out.println("first test");
		
		Assert.assertEquals(tip, false);
		
	}
	@Test
	public void test3() {
		Assert.assertEquals(tip, true);
	}
	@Test
	public void test4() {
		Assert.assertEquals(tip, false);
	}
	@Test
	public void test5() {
		Assert.assertEquals(tip, true);
	}
	
}
