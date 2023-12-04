package Leet;

public class Palindrome {
	
	public static String find(String s) {
		
		if(s==null)
		{
			return "invalid";
		}
		
	int len=0;
	int start=0,end=0;
		
		for (int i = 0; i < s.length(); i++) {
		
			for (int j = i+1; j<= s.length(); j++) {
				
				
				if(j-i+1>len&&isPalindrome(i,j,s))
				{
					len=j-i+1;
					start =i;
					end=j;
				}
			}
		}
		
		
		return s.substring(start,end);

	}
	
	private static boolean isPalindrome(int i, int j,String s) {
		
		for (int m = i,n=j-1; m < j/2; m++,n--) {
			
			if(s.charAt(m)!=s.charAt(n))
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(find("abaforgeeksskeegfora"));
//		System.out.println(isPalindrome("ab"));
	}

}
