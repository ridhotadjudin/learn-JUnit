package com.nexsoft.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nexsoft.junit.calculator.Calculator;

public class CalculatorTest {
	
	public Calculator kal;
	int a;
	int b;
	
	@Before
	public void beforeTest(){
		kal= new Calculator();
		a = 1234;
		b = 5678;
	}
	
	@Test
	public void testAdd() {
		int actual = kal.add(a,b);
		
		int expected = 6912;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int actual = kal.subtract(b,a);
		
		int expected = 4444;
		
		assertEquals(expected, actual);
	}

}
