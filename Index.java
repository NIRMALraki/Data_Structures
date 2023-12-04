package Leet;

public class Index {
	
	private static void getIndex(int colno) {

		StringBuilder sb = new StringBuilder();
		int num=colno;
		int rem=0;
		while(num>0)
		{
			rem=(num-1)%26;
			char c = (char) (('A'+rem));
			sb.insert(0, c);
			num = (num-1)/26;
		}
		System.out.println(sb);
		
	}
 public static void main(String[] args) {
	
	 getIndex(52);
	 		
	 
  }
}
