package br.inf.carlos.dsl.math;

import java.math.BigDecimal;

public class Calculator {
	
	public static boolean isNegative(Double value){
		return value.doubleValue() < 0;
	}
	
	public static boolean isPositive(Double value){
		return value.doubleValue() >= 0;
	}
	
	public static boolean isSame(Double thiz, Double with){
		return thiz.doubleValue() == with.doubleValue();
	}
	
	public static Double negativefy(Double value){
		
		if(value.doubleValue() > 0){
			return multiply(value, -1, 2);
		}
		
		return value;
	}
	
	public static Double positivefy(Double value){
		
		if(value.doubleValue() < 0){
			return multiply(value, -1, 2);
		}
		
		return value;
	}
	
	public static boolean greaterThen(Double thiz, Double with){
		int compareTo = thiz.compareTo(with);
		
		return compareTo > 0;
	}
	
	private static Double round(Double value, int fixed){
		
		BigDecimal big = new BigDecimal(value.doubleValue());
		
		big = big.setScale(fixed, BigDecimal.ROUND_HALF_DOWN);
		
		return new Double(big.doubleValue());
	}

	public static Double add(Double thiz, Double with, int fixed){
		return round((thiz + with), fixed);
	}
	
	public static Double add(Double thiz, Double with){
		return add(thiz, with, 2);
	}
	
	public static Double minus(Double thiz, Double with, int fixed){
		return round((thiz - with), fixed);
	}
	
	public static Double minus(Double thiz, Double with){
		return minus(thiz, with, 2);
	}
	
	public static Double multiply(Double thiz, int times, int fixed){
		return round((thiz * times), fixed);
	}
	
	public static Double multiply(Double thiz, int times){
		return multiply(thiz, times, 2);
	}
	
	public static Double divide(Double thiz, Double by, int fixed){
		return round((thiz / by), fixed);
	}
	
	public static Double divide(Double thiz, Double by){
		return divide(thiz, by, 2);
	}
}