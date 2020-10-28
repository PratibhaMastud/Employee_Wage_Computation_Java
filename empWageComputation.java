import java.util.*;
import java.util.Scanner;
//Author:Pratibha Mastud
//3.Add PartTime Employee and Wage

class EmpWageComputation{



  public static void main(String[] args) {
    int partTimeHour=8;
    int fullTimeHour=8;
    int wagePerHour=20;
    int wageP=0;
    int wageF=0;
    Scanner newObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter Employee Time like parttime or fulltime");

    String empTime = newObj.nextLine();  // Read user input
    
    if(empTime == "parttime"){
	wageP=partTimeHour*wagePerHour;
	System.out.println("Part time Wage : " +wageP);
    }else{
		wageF=fullTimeHour*wagePerHour;
        System.out.println("Part time Wage : " +wageF);

	}
    
  }





}
