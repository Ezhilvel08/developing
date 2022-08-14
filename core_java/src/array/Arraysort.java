package array;

import java.util.Arrays;
import java.util.Collections;

public class Arraysort {
	
	 int compare() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		String result = (a == b ? "true" : "false");
		System.out.println(result);
		return 0;
	}

	public static void main(String[] args) {
		
		String[] num = { "ball", "dog", "apple", "elephant", "cat" };

		Arrays.sort(num);
		System.out.println("sort no 1:" + Arrays.toString(num));

		Arrays.sort(num, 1, 3);
		System.out.println("sort no 2:" + Arrays.toString(num));

		Arrays.sort(num, Collections.reverseOrder());
		System.out.println("sort no 3:" + Arrays.toString(num));
		
		Arraysort arrange = new Arraysort();
		arrange.compare();
	}

}
