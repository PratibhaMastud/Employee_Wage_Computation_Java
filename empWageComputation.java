import java.util.*;
//Author:Pratibha Mastud
//2.Calculate Daily Employee Wage

class EmpWageComputation{


	public static void main(String[] args)
	{	
		int wagePerHour = 20;
		int fullDayHour = 8;
	//method calling
		int wageTot = calDailyWage(wagePerHour, fullDayHour);
	//wagePerHour, fullDayHour are actual parameters
 
		System.out.println("Daily Employee Wage = " + wageTot);
	}

	//user defined method

	//n1 ,n2 are formal parameters
	
	public static int calDailyWage(int n1, int n2)   
	{	
		int s;
		s=n1*n2;
		return s; //returning the sum
	}

}
