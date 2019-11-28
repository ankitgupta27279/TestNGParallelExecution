package com.pack3;

import org.testng.annotations.Test;

public class TestClass1514 {
	
	@Test(priority=1)
	public void func15() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test(priority=2)
	public void func14() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
