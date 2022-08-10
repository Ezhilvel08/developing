package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// difference between hashset and treeset
		Set<String> name = new HashSet<String>();
		name.add("ezhilvel");
		name.add("ramu");
		name.add("mukesh");
		name.add("murali");
		name.add("raj");
		name.add("jaya");
		name.add("murali");
		name.add("mukesh");
		name.add("arujun");
		name.add("sambu");

		// insertion order not maintain
		for (String namelist : name) {
			System.out.println("set : " + namelist);
		}

		System.out.println("-------------------------");
		// sort in ascending order
		Set<String> name_ls = new TreeSet<String>(name);
		for (String new_list2 : name_ls) {
			System.out.println("set :" + new_list2);

		}

	}

}
