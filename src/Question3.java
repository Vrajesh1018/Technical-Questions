import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * Input format
		 *  4
			5
			1 2 3 4 5
			5
			5 4 7 4 2
			6
			10 20 30 40 50 60
			3
			-5 -10 -1
			
			Output:
			Maximum is : 5 , Minimum is : 1
			Maximum is : 7 , Minimum is : 2
			Maximum is : 60 , Minimum is : 10
			Maximum is : -1 , Minimum is : -10

		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int t=0;t<testCases;t++)
		{
			int len = scan.nextInt();
			
			int a[] = new int[len];
			
			for(int i=0;i<len;i++)
				a[i] = scan.nextInt();
			
			// Time-Complexity :- O(N) , Space-Complexity :- O(1)
			
			int max = a[0],min = a[0];
			
			for(int i=1;i<len;i++)
			{
				if(a[i] > max)
					max = a[i];
				
				if(a[i] < min)
					min = a[i];
			}
			
//			System.out.println("Maximum is : "+max);
//			System.out.println("Minimum is : "+min);
			System.out.println("Maximum is : "+max+" , Minimum is : "+min);
			
		}
	}

}
