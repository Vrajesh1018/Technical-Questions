import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	
		/* Input Format
		 * 2
		 * anna
		 * india
		 * 
		 * output 
		 * Given String 'anna' is palindrome
		 * Given String 'india' is not palindrome
		 * 
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int t=0;t<testCases;t++)
		{
			String s = scan.next();
			
//			System.out.println(isPalindrome(s));
//			System.out.println(isPalindromeUsingTwoPointer(s));
						
			if(isPalindrome(s))
				System.out.println("Given String '"+s+"' is palindrome");
			else
				System.out.println("Given String '"+s+"' is not palindrome");
				
		}
		

	}

	private static boolean isPalindrome(String s) {
		
		StringBuffer sbf = new StringBuffer(s);
		sbf = sbf.reverse();
		
		return sbf.toString().equals(s);
		
	}
	
	private static boolean isPalindromeUsingTwoPointer(String s)
	{
		
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		
		return true;
	}

}
