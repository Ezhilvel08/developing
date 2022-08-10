package set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_to_list {

	public static void main(String[] args) {
		Set<String> name = new TreeSet<String>();
		name.add("eswaran");
		name.add("ramu");
		name.add("mulai");
		name.add("vimal");
		name.add("raj");
		name.add("jayalakshmi");
		name.add("mulai");
		name.add("vimal");
		name.add("arun");
		name.add("saravan");
		
	
		for (String namelist : name) {
			System.out.println("set : " + namelist);
		}
		
		List<String> list = new ArrayList<>(name);
		String indexno = list.get(3);
		System.out.println("get index value in set:"+indexno);

	}

}
