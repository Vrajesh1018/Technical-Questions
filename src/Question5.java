import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Input Format : 
		 * 2
		 * 12 33
		 * 45 67
		 * 
		 * Output : 
		 * After swapping a : 33 , b : 12
		   After swapping a : 67 , b : 45

		 */
		
		
		Scanner scan = new Scanner(System.in);
		

		int testCases = scan.nextInt();
		
		for(int t=0;t<testCases;t++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			/*
			
//			// 1st method  using subtraction and division operator
			a = a + b;
			b = a - b;
			a = a - b;
			
			*/
			
			// 2nd method  using bitwise ex-or operator
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			
			System.out.println("After swapping a : "+a+" , b : "+b);
			
		
		}
		scan.close();

	}

}
