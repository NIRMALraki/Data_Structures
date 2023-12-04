package Leet;

import java.util.HashSet;

public class Pangram {

	public static String findMissing(String value)
	{
		if(value==null)
		{
			return "Invalid";
		}
		value=value.toLowerCase();
		HashSet<Character> cs = new HashSet<>();
		String missed="";
		 for (Character character : value.toCharArray()) {
			 if(Character.isLetter(character))
			 {
					cs.add(character);

			 }
		}
		
		for(char ch='a';ch<='z';ch++)
		{
			if(!cs.contains(ch))
			{
				missed=missed+""+ch;
				
			}
		}
		
		return missed;
	}
		
	
	public static void main(String[] args) {
		
		System.out.println(findMissing("bca897;"));
		
	}
}
