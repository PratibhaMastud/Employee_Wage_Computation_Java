import java.util.*;

//Author:Pratibha Mastud
//5.Find Employee Wage Computation till Day is reached for month.

class EmpWageComputation{

  public static void main(String[] args) {
   
    int fullTimeHour=8;
    int wagePerHour=20;
    int wageF=0;
   int wageDayWise=0;

   for(int i=1; i<=20; i++){
	
	    wageF=fullTimeHour*wagePerHour;
	    wageDayWise=i*wageF;
                

	    	System.out.println("Full time Wage Per Day : " +wageF);
                
		System.out.println("Full time Wage Day wise : "+"Day -"+i+"= "+wageDayWise);
	}

   }
    

}
