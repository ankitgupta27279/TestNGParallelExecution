package com.pack1;

import org.testng.annotations.Test;

public class TestClass76 {

	@Test(priority=1)
	public void func7() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test(priority=2)
	public void func6() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
}
