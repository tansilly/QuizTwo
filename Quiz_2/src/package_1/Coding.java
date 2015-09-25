/**
 * 
 * 
 * @author Tim
 * 
 *
 */

package package_1;

import java.util.Scanner; // scanner
import org.apache.poi.ss.formula.functions.FinanceLib; //importing the functions that will determine Present Value and the PMT
import static org.junit.Assert.assertEquals; //J Unit for testing
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Coding {
	
	public static void main(String[] args) {
		
		//variable types
		double r;
		double n;
		double p;
		double f;
		double y;
		boolean t;
		
		Scanner input = new Scanner(System.in);
		
		// collecting input
		System.out.print("Enter initial tuition cost: ");
		double ITC = input.nextDouble();
		
		System.out.print("Enter percentage increase for tuition: ");
		double PIT = input.nextDouble();
		
		System.out.print("Enter repayment APR: ");
		double RAPR = input.nextDouble();
		
		System.out.print("Enter Term: ");
		double Term = input.nextDouble();
		
		// calculating the future value of tuition
		double FV;
		r = RAPR / 100;
		n = Term;
		y = Term / 12;
		p = ITC;
		t = false;
		
		FV = FinanceLib.fv(r, n, y, p, t);
		System.out.printf("Total Cost of Tuition = $%,.2f%n", FV);

		// calculating the payment rate and method
		double PMT;
		r = RAPR / 100;
		n = Term;
		p = ITC;
		f = FV;
		t = false;
		
		PMT = FinanceLib.pmt(r,n,p,f,t);
		System.out.printf("Amount to pay monthly = $%,.2f%n", PMT);

		input.close();
		
		}

	}		
