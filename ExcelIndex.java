package Leet;

public class ExcelIndex {
	
	private static String getColNam(int input) {
		
			if(input==0)
			{
				return "invalid input";
			}
			
			int num = input;//52
			int rem=0;
			StringBuilder output = new StringBuilder();
			while(num>0)//52>0 1>0 0>0
			{
				rem=num%26;//0 1
				
					if(rem==0)
					{
						output.insert(0, 'Z');//Z
						num=(num/26)-1;//52/26-1=1
					}
					else
					{
						char ch = (char)(('A'+rem)-1); //A+1-1=A
						output.insert(0, ch);//AZ
						num=num/26;//1/26=0
					}
				
				
			}
				return output.toString(); //AZ

	}

	public static void main(String[] args) {

		System.out.println(getColNam(1));
	}

}
