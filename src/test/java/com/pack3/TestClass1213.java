package com.pack3;

import org.testng.annotations.Test;

public class TestClass1213 {
	
	@Test(priority=1)
	public void func12() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test(priority=2)
	public void func13() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
