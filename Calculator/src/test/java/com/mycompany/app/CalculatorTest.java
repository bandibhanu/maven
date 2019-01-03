package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
	private Calculator object1;

	@Before
	public void setUp() {
		object1 = new Calculator();
	}

	@Test
	public void add() {
		int  expected= 3;
		int actual = object1.add(2, 1);
		assertEquals(expected,actual);
			
	}
	@Test
	public void addWithNegativeValue() {
		int  expected= -1;
		int actual = object1.add(-2, 1);
		assertEquals(expected,actual);
			
	}
	@Test
	public void addWithZeroValue() {
		int  expected= 1;
		int actual = object1.add(0, 1);
		assertEquals(expected,actual);
	}
	@Test
	public void addWithBothNegativeValue() {
		int  expected= -2;
		int actual = object1.add(-1,-1);
		assertEquals(expected,actual);
	}
	@Test
	public void minus()
	{
		int expected=3;
		int actual=object1.minus(4,1);
		assertEquals(expected,actual);
		//System.out.println(actual);
	}
	public void minusWithZero()
	{
		int expected=4;
		int actual=object1.minus(4,0);
		assertEquals(expected,actual);
		//System.out.println(actual);
	}
	public void minusWithBothNegatives()
	{
		int expected=-3;
		int actual=object1.minus(-4,-1);
		assertEquals(expected,actual);
		//System.out.println(actual);
	}

	@Test
	public void multiply()
	{
		int expected=3;
		int actual=object1.multiply(3,1);
		assertEquals(expected,actual);
		
	}
	@Test
	public void multiplyBothNegative()
	{
		int expected=3;
		int actual=object1.multiply(-3,-1);
		assertEquals(expected,actual);
		
	}
	@Test
	public void multiplyWithZero()
	{
		int expected=0;
		int actual=object1.multiply(-3,0);
		assertEquals(expected,actual);
		
	}
	@Test
	public void divide()
	{
		double expected=1;
		double actual;	
		actual = object1.division(1,3);
		assertEquals(expected,actual,2);
	
	}
	@Test
	public void divideWithNegative() throws InvalidException 
	{
		double expected=1;
		double actual;
		actual = object1.division(1,1);
		assertEquals(expected,actual,2);
		
	}
	
}
