package lab1;
// import Scanner from library
import java.util.Scanner;

//import accounting formulas from library
import org.apache.poi.ss.formula.functions.*;

public class retirement_kexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner
		java.util.Scanner input = new Scanner(System.in);
		
		//ask for the year
		System.out.print("Type how many years you want to work ");
		double workYears = input.nextDouble();
		
		//ask for expected annual return on use's investment 
		System.out.print("Type the expected annual return on your investment");
		double annualReturnI = input.nextDouble();
		
		//ask for how long user's want to draw
		System.out.print("how long you want to draw");
		double yearstoDraw = input.nextDouble();
		
		//ask for the annual return when user retires
		System.out.print("What's your annual return when you retired");
		double annualreturnR = input.nextDouble();
		
		//ask for user's required income
		System.out.print("What's your required income? ");
		double Income = input.nextDouble();
		
		//ask for monthly SSI
		System.out.print("What's your monthly SSI");
		double MonthlySSI = input.nextDouble();
		
		//calculate the monthly rate of return on user's investment 
		double monthReturnI = annualReturnI / 12;
		
		//calculate the monthly return after retire 
		double monthReturnR = annualreturnR /12 ;
				
		
		//calculate the payment
		double payment = Income - MonthlySSI ;
		
		//set the present and future value to 0
		double present = 0;
		double future = 0;
		
		// set boolean t to false
		boolean t = false;
		  
		// To calculate  present value 
		double Present = FinanceLib.pv(monthReturnR, yearstoDraw * 12, payment, future, t);
		  
		// To show the result of present value 
		System.out.println("Amount you need to save is " + Present);
		  
		// To calculate payment 
		double Payment =FinanceLib.pmt(monthReturnI, workYears * 12, present, Present, t);
		  
	    // To show the result of  payment
		System.out.println("Amount you need to save each month is " + Payment);
		  
				
		
		
		
		

	}

}
