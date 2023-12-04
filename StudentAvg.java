package Leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class StudentAvg {

	public static int higAvg1(String[][] values) {
		
		if(values==null || values.length<1)
		{
			return 0;
		}
		HashMap<String, ArrayList<Integer>> result = new HashMap<>();
		int max = 0;

		for (int i = 0; i < values.length; i++) {
			if (!result.containsKey(values[i][0])) {

				ArrayList<Integer> marks = new ArrayList<>();
				marks.add(Integer.parseInt(values[i][1]));
				result.put(values[i][0], marks);

			}
			else {
				result.get(values[i][0]).add(Integer.parseInt(values[i][1]));

			}
//			Integer temp = Integer.parseInt(values[i][1]);

		}

		for (Entry<String, ArrayList<Integer>> m : result.entrySet()) {

			int sum = 0;
			int avg = 0;
			for (int i = 0; i < m.getValue().size(); i++) {

				sum += m.getValue().get(i);
			}
			avg = (int) Math.floor(sum / m.getValue().size());
//			System.out.println(avg);

			if (max < avg)
			{
				max = avg;
			}
		}

//		System.out.println(result);
		return max;
	}

	public static void main(String[] args) {

		String[][] values = { { "A", "25" }, { "b", "20" }, { "a", "20" } };
		System.out.println(higAvg1(values));

		//10a as marks
		//case sensitive
	}

}