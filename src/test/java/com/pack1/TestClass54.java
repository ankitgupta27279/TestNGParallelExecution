package com.pack1;

import org.testng.annotations.Test;

public class TestClass54 {

	@Test(priority=1)
	public void func5() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test(priority=2)
	public void func4() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
}
