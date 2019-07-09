package com.amdocs;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack;
	
	private double firstNumber , secondNumber , result;
	public RPNCalculator()
	{
		numberStack = new Stack<Double>();
		firstNumber = 0.0;
		secondNumber = 0.0;
		result = 0.0;
	}
	public double calculate(String rpnMathExpression) {
		
		String[] rpnTokens = rpnMathExpression.split(" ");
		
		IMathOperation mathOperation = null;
		for( String Token : rpnTokens )
		{
			if(isMathOperator(Token))
			{
				mathOperation = MathFactory.getObject(Token);
				extractInputs();
				result = mathOperation.calculate(firstNumber,secondNumber);
				numberStack.push(result);
			}
			else
			{
				numberStack.push(Double.parseDouble(Token));
			}
		}
		return numberStack.pop();
	}
	private boolean isMathOperator(String mathBinaryOperator) {
		String mathOperators = "+-*/";
		return mathOperators.contains(mathBinaryOperator);
	}
	
	private void extractInputs() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}
	
	

}
