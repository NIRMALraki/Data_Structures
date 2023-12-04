package Leet;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NonRep {
	
	public static char find(String s)
	{
		if(s.isEmpty()||s==null)
		{
			System.out.println("invaid String");
		}

		LinkedHashMap<Character, Integer> results = new LinkedHashMap<>() ;
		
		for(int i=0;i<s.length();i++)
		{
			results.put(s.charAt(i), results.getOrDefault(s.charAt(i), 0)+1);
			
		}
		
		for( Entry<Character, Integer> c : results.entrySet())
		{
			if(c.getValue()==1)
			{
				return c.getKey();
			}
		}
				
		return 'O' ;
		
	}


	public static void main(String[] args) {
		
		System.out.println(find("dcba"));
		
		
	}
}
