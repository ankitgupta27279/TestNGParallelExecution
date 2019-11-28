package com.pack2;

import org.testng.annotations.Test;

public class TestClass89 {
	
	@Test(priority=1)
	public void func8() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test(priority=2)
	public void func9() {
		System.out.println(System.getProperty("user.dir")+"\t"+this.getClass().getName()+"\t"+new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
