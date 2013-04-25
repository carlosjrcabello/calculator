package br.inf.carlos.dsl.math;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void gtTest() {
		
		Double a = 10D;
		Double b = 20D;

		assertTrue(Calculator.gt(b, a));
		
		System.out.println("Calculator.minus(2.93939D, 3D, 2); " + Calculator.minus(2.93939D, 3D, 2));
	}
	
	@Test
	public void booleansFunctions() {
		assertTrue(Calculator.isPositive(new Double(3)));
		assertFalse(Calculator.isPositive(new Double(-3)));
		
		Double a = 10D;
		Double b = 11D;
		
		assertTrue(Calculator.ne(a, b));
		assertTrue(Calculator.lt(a, b));
		assertTrue(Calculator.le(a, b));
		assertFalse(Calculator.gt(a, b));
	}
	
	@Test
	public void modFunction() {
		
		Double a = 20D;
		Double b = 2D;
		
		int mod = Calculator.mod(a, b);
		
		assertTrue(mod == 0);
		
		a = 21D;
		
		mod = Calculator.mod(a, b);
		
		assertFalse(mod == 0);
	}
	
	@Test
	public void inverseFunctions() {
		assertTrue(Calculator.isPositive(Calculator.positivefy(new Double(-30))));
		assertFalse(Calculator.isPositive(Calculator.negativefy(new Double(50))));
		assertFalse(Calculator.isPositive(Calculator.negativefy(new Double(-30))));
		
		assertTrue(Calculator.isNegative(Calculator.negativefy(new Double(100))));
	}
}
