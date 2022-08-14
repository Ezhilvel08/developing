package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removedupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] list = { 1, 1, 95, 95, 5, 25, 23, 3, 24, 4, 8, 41 };

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(list));
		for (Integer remove : set) {
			System.out.println(remove);
		}
		System.out.println("=========================");

		List<Integer> aList = new ArrayList<>(Arrays.asList(list));
		for (Integer convertlist : aList) {
			System.out.println(convertlist);
		}

	}

}
