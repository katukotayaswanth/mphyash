package com.mph.mvnproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParamTest {
	private int x,y,result;
	Calculate calc;
	
	public MyParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;		
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{10,20,30},{20,20,40},{200,500,700},{20,30,50}});
	}
	@Test
	public void testSum()
	{
		System.out.println("Add Test" );
		assertEquals(result, calc.add(x,y));
		
	}
	@Test
	public void testmul()
	{
		System.out.println("Add Test2" );
		assertNotEquals(result, calc.multiply(x,y));
}
}
	
