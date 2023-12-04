package Leet;

import java.util.Stack;

public class ValidParentheses {
	
		private static boolean validate(String input ) {
			
			
			if(input==null||input.isEmpty())
			{
				return false;
			}
			Stack<Character> st = new Stack<>();
			
			for (int i = 0; i < input.length(); i++) {   //([7}()
				
				switch(input.charAt(i))
				{
				case '{':
					st.push('}'); break;
				case '[':
					st.push(']'); break;
				case '(':
					st.push(')'); break;
				default:
					if(st.isEmpty()||st.pop()!=input.charAt(i))
					{
						return false;
					}
				}     // ])
				
			}

			
			
			return st.isEmpty();
			
		}
	//arraydequ

	public static void main(String[] args) {

		System.out.println(validate("[({})]"));
		System.out.println(validate("[]{}()"));
		System.out.println(validate("(}[7}()"));
	}

}
