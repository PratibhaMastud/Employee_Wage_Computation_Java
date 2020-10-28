import java.util.*;

//Author:Pratibha Mastud
//7.Find Employee Wage Computation Using methods.

class EmpWageComputation{

  
public static void main(String[] args)
	{	
		int wagePerHour = 20;
		int fullDayHour = 8;
		//method calling
		int wage = calEmployeeWage(wagePerHour, fullDayHour);

		//wagePerHour, fullDayHour are actual parameters

		System.out.println("Employee Wage = " + wage);
	}

	//user defined method
	
	//n1 ,n2 are formal parameters

public static int calEmployeeWage(int n1, int n2)   
{	
		int wage;
		wage=n1*n2;
		return wage; //returning the wage
}



}
