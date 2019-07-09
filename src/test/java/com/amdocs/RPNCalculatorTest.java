package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {
	
	@Test
	public void testSimpleAddition() {
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 12 +");
		double expectedResult = 22.0;
		assertEquals(expectedResult,actualResult,0.0001);
		
	}
	
	@Test
	public void testSimpleSubtraction()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("100 20 -");
		double expectedResult = 80.0;
		assertEquals(expectedResult,actualResult,0.0001);
	}

	@Test
	public void testSimpleMultiplication()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("2 1 *");
		double expectedResult = 2.0;
		assertEquals(expectedResult,actualResult,0.0001);
	}
	
	@Test
	public void testSimpleDivision()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 5 /");
		double expectedResult = 2.0;
		assertEquals(expectedResult,actualResult,0.0001);
	}
	
	@Test
	public void testSimpleCmplex()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 2 + 100 5 / *");
		double expectedResult = 240.0;
		assertEquals(expectedResult,actualResult,0.0001);
	}
	
}
