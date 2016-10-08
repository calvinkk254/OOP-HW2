package hw;

import java.util.Scanner;

public class KeyboardScanner {

	
	public static void main(String[] args) {
		
		int a ;
		float b;
		String c;
				
		float d;
		 
		
	
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter a integer:");
		a = Scanner.nextInt();
		System.out.println("Enter a float point number:");
		b = Scanner.nextFloat();
		System.out.println("Enter your name:");
		c = Scanner.next();
		
		d = a*b ;
		
		System.out.printf("Hi " +c +", the mutiplication of " + a + " and " + b + " is "+ "%e" , d );
	
	

	}
}