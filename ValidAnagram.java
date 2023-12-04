package Lleet.optional;

import java.util.Objects;

public class ValidAnagram {

	private static boolean isAnagaram(String s, String t) {

		if(s.length()!=t.length())
		{
			return false;
		}
		
		
		int[] alphabet = new int[26];
		for (int i = 0; i < s.length(); i++)
		{
			alphabet[s.charAt(i) - 'a']++;
			alphabet[t.charAt(i) - 'a']--;
			
		}
			
		for (int i : alphabet) {
			if (i != 0) {
				return false;
			}

		}

		return true;

	}
	
	private static boolean isAnagaramOptimal(String s, String t) {
		
//		System.out.println(s.hashCode());
//		System.out.println(t.hashCode());
		
		if(addUni(s)==addUni(t)&&multiplyUni(s)==multiplyUni(t))
		{
			return true;
		}
		
		return false;
	}
	
	private static long getHash(String s)
	{
		int hash=0;
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			hash+=((hash << 5) - hash) +c ;
			hash |= 0;
		}
		System.out.println(hash);
		
		return hash;
	}
	
	private static int addUni(String s)
	{
		int val=0;
		for (int i = 0; i < s.length(); i++) {
			val+=s.charAt(i);
		}
		
		return val;
	}
	private static int multiplyUni(String s)
	{
		int val=1;
		for (int i = 0; i < s.length(); i++) {
			val*=s.charAt(i);
		}
		
		return val;
	}

	public static void main(String[] args) {

	
		System.out.println(isAnagaramOptimal("ac", "bb"));
	}

}

//aa a
//ac bb
//fe ja
//"anagram nagaram
