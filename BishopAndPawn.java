package Leet;

public class BishopAndPawn {
	
	private static boolean  getResult(int bisx, int bisy, int pawnx, int pawny) {

		
		if(pawnx-bisx==pawny-bisy || -(pawnx)+pawny==pawny-bisy)
		{
			
			return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getResult(5, 5, 1, 3));
	}

}
