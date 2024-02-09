package com.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {

	@Test(groups = {"group1"})
	public void Add() {
		Assert.assertEquals(2, 2);
	}
	
	@Test(groups = {"group2"})
	public void Subtract() {
		Assert.assertEquals(3, 3);
	}
	
	@Test(groups = {"group1"})
	public void multiply() {
		Assert.assertEquals(4, 4);
	}
}
