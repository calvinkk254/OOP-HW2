package hw;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		int a;
		
		
		String b = "ONE" , c = "TWO" , d = "THREE", e ="FOUR" ,f = "FIVE" , g="SIX" , h="SEVEN" ,i="EIGHT" ,j="NINE" ;
		
		
		
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter a integer:");
		a = Scanner.nextInt();
		
		if(a<10)		
			{
			if(a==1)
				System.out.println("The input integer is \"" +b +"\"");
			if(a==2)
				System.out.println("The input integer is \"" +c +"\"");
			if(a==3)
				System.out.println("The input integer is \"" +d +"\"");
			if(a==4)
				System.out.println("The input integer is \"" +e +"\"");
			if(a==5)
				System.out.println("The input integer is \"" +f +"\"");
			if(a==6)
				System.out.println("The input integer is \"" +g +"\"");
			if(a==7)
				System.out.println("The input integer is \"" +h +"\"");
			if(a==8)
				System.out.println("The input integer is \"" +i +"\"");
			if(a==9)
				System.out.println("The input integer is \"" +j +"\"");
				}
			else
			{
				System.out.println("The input integer is OTHER");
			}
			
		
	}
}
