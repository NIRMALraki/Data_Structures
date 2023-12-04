package Leet;

import java.util.ArrayList;

public class UnqStr {
	
	public static ArrayList<String> getUnique(String s , int length)
	{
		
		if(s==null||s.isEmpty())
		{
			return new ArrayList<>();
		}
		ArrayList<String> result = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			String val="";
			for (int j = i; j < s.length(); j++) {
				
				val += s.charAt(j);
				if(val.length()==length&&!result.contains(val))
				{
					
						result.add(val);
						break;
					
				}
				
			}
			
		}
		
		return result;
	}
			
		public static void main(String[] args) {
			
			
			System.out.println(getUnique("aabcde",3));
		}
	
	

}
