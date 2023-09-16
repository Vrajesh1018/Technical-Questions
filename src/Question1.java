import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args)  {
		
		// Input format 
		/*
		 * no of testcases
		 * character whose occurrence need to find  
		 * String
		 * 
		 * ex.
		 * 2
		 * 
		 * e
		 * geeksforgeeks
		 * 
		 * a
		 * abccdefgaa.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int t=0;t<testCases;t++)
		{
			char ch = scan.next().charAt(0);
			String s = scan.next();
			
			int ans = countOccurrencesLinearSearch(s,ch);
			
//			int ans = countOccrrencesUsingMap(s,ch);
			
			
//			System.out.println(ans);
			
			System.out.println("Character '"+ch+"' occurs "+ans+" times in String '"+s+"'");
		}
		
		
	}

	
	// Time Complexity :- O(N) , Space Complexity :- O(1)
	private static int countOccurrencesLinearSearch(String s, char ch) {
	
		int ans = 0;
		
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==ch)
				ans++;
		
		return ans;
		
	}
	
	// Time Complexity :- O(N) , Space Complexity :- O(N)
	private static int countOccrrencesUsingMap(String s, char ch) {
		
		Map<Character,Integer> m = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
			m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
		
		return m.get(ch);
		
	}

}
