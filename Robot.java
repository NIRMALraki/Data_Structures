package Leet;

public class Robot {

	public static int[] find(String s)
	{
		int[] result = {0,0};
		if( s==null ||s.isEmpty())
		{
			return result;
		}
	
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='L') // L [-1,0] 
			{
				result[0]--;
			}
			else if(s.charAt(i)=='R')
			{
				result[0]++;
				
			}
			else if(s.charAt(i)=='U')
			{
				result[1]++;
			}
			else if(s.charAt(i)=='D')
			{
				result[1]--;
			}
			else
			{
				return result;
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] result = find("UDRR");
		System.out.print(result[0]);
		System.out.println(result[1]);
		
	}
	
}
