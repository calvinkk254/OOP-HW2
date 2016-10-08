package hw;

	import java.util.Scanner;

	public class StringComparator {

		public static void main(String[] args) { 
			
			int a;		
			String []b = { "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" };
				
			Scanner Scanner = new Scanner(System.in);

			System.out.println("Enter a integer:");
			a = Scanner.nextInt();
			
			
			
			if(a<10 && a>0)		
				{
				a--;
				System.out.println("your number equal to: " + b[a]);
				}
				else
				{
					System.out.println("The input integer is OTHER");
				}					
		}
	}