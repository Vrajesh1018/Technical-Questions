import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
		/*
		 * Input Format 
		 * 
		 * 1
		 * Hello
		 * World
		 * 
		 * Output:
		 * Strings after swap is a :  World, b: Hello
		 *
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		

		int testCases = scan.nextInt();
		
		for(int t=0;t<testCases;t++)
		{
			String a = scan.next();
			String b = scan.next();
			
			// concatenate 2nd string to 1st string 
			a = a + b;  //(total length will become a.length() + b.length()
			
			b = a.substring(0,a.length()-b.length());   // as a contains concatenate string we can extract portion of a by substring method and assign it to b 
			
			a = a.substring(b.length());  
			
			System.out.println("Strings after swap is a :  "+a+", b: "+b);
			
		
		}
		scan.close();
	}

}
