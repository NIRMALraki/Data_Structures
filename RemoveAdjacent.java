package Lleet.optional;

import java.util.Stack;

public class RemoveAdjacent {

	private static String removeAllAdjacent(String s) {

		if(s==null || s.length()==0)
		{
			return "invalid input";
		}
		
		Stack<Character> st = new Stack<>();
		
		st.push(s.charAt(0)); //s=c,a
		for (int i = 1; i < s.length(); i++) { //aaaaaaaa 
			
			
				if(!st.isEmpty()&&st.peek()==s.charAt(i))//a!=b  c!=c
				{
					st.pop();
					
				}
				else
				{
					st.push(s.charAt(i));
				}
			
		}
		StringBuilder result =new StringBuilder();
		int len= st.size();
		 for (int i = 0; i <len; i++) {
			
			 result.insert(0,st.pop());
		}
		
		
		return result.toString();
		
	}
	
	
	
	public static void main(String[] args) {

		
		System.out.println("hi"+removeAllAdjacent("abba")); 
		
	}

}
