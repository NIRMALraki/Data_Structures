package Leet;

public class CountChar {
	
	public static String count(String s)
	{
		
		String result="";

		for (int i = 0; i < s.length(); i++) {
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i=j;
				}
				
			}
			
			result=result+""+s.charAt(i)+count;
		}
		
		return result;
	}
	
	public static String countOpti(String s)
	{
		if(s==null||s.isEmpty())
		{
			System.out.println("invalid output");
			return "-1";
		}
		int count=1;
		StringBuilder result=new StringBuilder();
		int i =1;
		for (; i<s.length(); i++) {
			
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				result.append(s.charAt(i-1));
				result.append(count);
//				System.out.println(count);
				
				count=1;

			}
			
			
		}
		result.append(s.charAt(i-1)).append(count);

//		System.out.println("end");
		
		
		
		return result.toString();
	}


	public static void main(String[] args) {
		
		System.out.println(countOpti("aab"));
		
	}
	
}
