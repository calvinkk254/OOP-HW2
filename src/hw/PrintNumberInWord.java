package hw;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		
		String a;
		String b;
		
		boolean c;
		
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter string one:");
		a = Scanner.next();
		System.out.println("Enter stirng two:");
		b = Scanner.next();

		c = a.equalsIgnoreCase(b);
		
		System.out.println(c);
		
		if(c)
		{
		System.out.println("the two string are the same" );
		}
		else
		{
		System.out.println("the two string are not the same" );	
		}
	
	}

	private static boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
