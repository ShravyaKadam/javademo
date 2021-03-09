package com.demo01;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestCalculator {
	@Test
	public void shouldAddNumbers() {
		Calculator cal = new Calculator();
		int a = cal.add(2, 3);
		if(a == 5) {
			System.out.println("working");
		} else {
			System.out.println("not working");
		}
		Assert.assertTrue(a==5);
		Assert.assertEquals(a, 12);
	}
}

