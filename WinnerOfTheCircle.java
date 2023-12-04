package Leet;

import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfTheCircle {
	private static int findWinner(int n, int k) {
		
		
		if(n==0 || k==0) {
			return 0;
		}

		Queue<Integer> q = new LinkedList<>();

		for(int i = 1; i<=n;i++) {
			q.add(i);
		}
		System.out.println(q);
		while(q.size()>1) {
			for(int i =1;i<k;i++) {
				q.add(q.poll());
			}
			q.poll();

 

		}
		return q.poll();
		
	}

	public static void main(String[] args) {

		System.out.println(findWinner(5, 2));
		
	}

}
