package com.mycompany.app;


public class Calculator 
{

	public int add(int oneVariable, int twoVariable) {
	
		return oneVariable+twoVariable;
	}

	public int minus(int oneVariable, int twoVariable) {
		
		return oneVariable-twoVariable;
	}

	public int multiply(int oneVariable, int twoVariable) {
	
		return oneVariable*twoVariable;
	}

	public double division(int oneVariable, int twoVariable) {
		
		double divide = 0;
		if(twoVariable>0)
		{
			divide= oneVariable%twoVariable;
	    }
		else
		{
			try {
				throw new InvalidException("enter greater than zero");
			} catch (InvalidException e) {
			
				e.printStackTrace();
			}
		}
		return divide;
		
		}

	
  
}
