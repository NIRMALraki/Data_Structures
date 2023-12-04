package Leet;

public class IntegerFromString {
	
	private static long getInteger(String input) {

		if(input==null||input.isEmpty())
		{
			return 0;
		}
		if(input.length()==1&&Character.isDigit(input.charAt(0)))
		{
			return Integer.parseInt(""+input.charAt(0));
		}
		
		long output=0;
		int i=0;
		
		if(input.charAt(0)=='-'&& Character.isDigit(input.charAt(1)))
		{
			output=Integer.parseInt(input.charAt(0)+""+input.charAt(1));
			i=2;
		}
		else
		{
			i=0;
		}
		
		
		for (; i < input.length(); i++) {
			
			if(Character.isDigit(input.charAt(i)))			
			{
				
				
					output=output*10;
					output=output-Integer.parseInt(""+input.charAt(i));
				
			}
			else
			{
				
				return output;
			}
			
			
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getInteger("-908asdds"));
	}
	
	

}
