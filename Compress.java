package Leet;

public class Compress {
	
	public static String  getCompress(String s) {
		
		if(s==null||s.isEmpty())
		{
			return "invalid input";
		}
		StringBuilder result = new StringBuilder();
		int len= s.length();
		while(len>1)
		{
				if(len%2==0&&s.substring(0, len/2).equals(s.substring(len/2,len)))
				{
					result.insert(0,'*');
					len=len/2;
				}
				else
				{
					result.insert(0, s.charAt(len-1));
					len--;
				}
			
		}
		result.insert(0, s.charAt(0));
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(getCompress("AAA")); //AB*C*D  DABABCABA
		
	}

}
