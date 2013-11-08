package br.inf.carlos.dsl.math;

import java.math.BigDecimal;
import java.util.Collection;

public class Calculator {
	
	public static Double sum(Collection<Double> values, int fixed){
		if(values == null || values.isEmpty()){
			return 0D;
		}
		Double result = 0D;
		for (Double d : values) {
			result = add(result, d);
		}
		return round(result, fixed);
	}
	
	public static Double valuePerHour(Double hourValue, Integer minutesWorked){
		if(isNull(hourValue) || minutesWorked == null || isZero(hourValue)){
			return 0D;
		}
		Double minuteValue = divide(hourValue, 60D, 8);
		return minuteValue * minutesWorked.intValue();
	}
	
	public static Double sum(Collection<Double> values){
		return sum(values, 2);
	}
	
	public static boolean isZero(Double value){
		return value.doubleValue() == 0;
	}
	
	public static boolean isNull(Double value){
		return value == null;
	}
	
	public static boolean isNegative(Double value){
		return value.doubleValue() < 0;
	}
	
	public static boolean isPositive(Double value){
		return value.doubleValue() >= 0;
	}
	
	public static boolean isSame(Double thiz, Double with){
		return thiz.doubleValue() == with.doubleValue();
	}
	
	public static Double doubleOf(Integer value){
		return new Double(value);
	}
	
	public static Double negativefy(Double value){
		
		if(value.doubleValue() > 0){
			return multiply(value, -1, 2);
		}
		
		return value;
	}
	
	public static Integer negativefy(Integer value){
		return new Integer(negativefy(value.doubleValue()).intValue());
	}
	
	public static Integer positivefy(Integer value){
		return new Integer(positivefy(value.doubleValue()).intValue());
	}
	
	public static Double positivefy(Double value){
		
		if(value.doubleValue() < 0){
			return multiply(value, -1, 2);
		}
		
		return value;
	}
	
	public static Double invert(Double value){
		
		if(isPositive(value)){
			value = negativefy(value);
		}
		else{
			value = positivefy(value);
		}
		
		return value;
	}
	
	//the value 0 if anotherDouble is numerically equal to this Double; 
	//a value less than 0 if this Double is numerically less than anotherDouble; 
	//and a value greater than 0 if this Double is numerically greater than anotherDouble.
	
	public static boolean le(Double thiz, Double with){
		return ( lt(thiz, with) || eq(thiz, with) );
	}
	
	public static boolean ge(Double thiz, Double with){
		return (gt(thiz, with) || eq(thiz, with));
	}
	
	public static boolean gt(Double thiz, Double with){
		return compator(thiz, with) > 0;
	}
	
	public static boolean lt(Double thiz, Double with){
		return compator(thiz, with) < 0;
	}
	
	public static boolean eq(Double thiz, Double with){
		return compator(thiz, with) == 0;
	}
	
	public static boolean ne(Double thiz, Double with){
		return !eq(thiz, with);
	}
	
	private static int compator(Double thiz, Double with){
		return thiz.compareTo(with);
	}
	
	public static int mod(Double thiz, Double with){
		return (int) (thiz % with);
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