package com.amdocs;

import java.util.HashMap;

public class MathFactory {
	static HashMap<String, String> classNameMap = null;
	
	static {
		classNameMap = new HashMap<String, String>();
		classNameMap.put("+","com.amdocs.Addition");
		classNameMap.put("-","com.amdocs.Subtraction");
		classNameMap.put("*","com.amdocs.Multiplication");
		classNameMap.put("/","com.amdocs.Division");

	}

	public static IMathOperation getObject(String binaryMathOperator) {
	
		IMathOperation mathOperation = null;
		String className = classNameMap.get(binaryMathOperator);
		//mathOperation = 
		if( binaryMathOperator.equals("+"))
		{
			mathOperation = new Addition();
		}
		else if(binaryMathOperator.equals("-"))
		{
			mathOperation = new Subtraction();
		}
		else if(binaryMathOperator.equals("*"))
		{	mathOperation = new Multiplication();
		
		}
		else if(binaryMathOperator.equals("/"))
		{		mathOperation = new Division();
		
		}
			
		return mathOperation;
	}

}
