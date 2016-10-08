package hw;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		int a; 
		float b;
		
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter a integer:");
		a = Scanner.nextInt();
		
		b = a%2;
		
		if(b>0)
		{
			System.out.println("块计琌计");
		}
		else
		{	
			System.out.println("块计琌案计");
		}
	}

}