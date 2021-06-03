package com.epam.calculator;

/**
 * 
 * @author Karri Hari Hara Venkata Koteswararao
 *
 */

public class calculator {
	
	/*
	 * This method will return sum of two numbers
	 */
	
	public int Addition(int number1, int number2) {
		return number1 + number2;
	}
	
	/*
	 * This method will return difference of two numbers
	 */
	
	public int Subtraction(int number1, int number2) {
		return number1 - number2;
	}
	
	/*
	 * This method will return product of two numbers
	 */
	
	public int Multiplication(int number1, int number2) {
		return number1 * number2;
	}
	
	/*
	 * This method will return division of two numbers
	 * Throws exception when number2 is zero
	 */
	
	public int Division(int number1, int number2) throws Exception{
		if(number2 == 0) 
			throw new ArithmeticException("Divide by zero");
		return number1 / number2;
	}
}
