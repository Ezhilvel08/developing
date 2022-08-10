package set;

import java.util.HashSet;

public class Hashseet {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("ezhilvel");
		name.add("ramu");
		name.add("murali");
		name.add("vimal");
		name.add("raj");
		name.add("jayalakshmi");
		name.add("murali");
		name.add("vimal");
		name.add("arun");
		name.add("saravan");
		
		
		boolean rm=	name.remove("arun");
		System.out.println("name is remove:"+rm);
		System.out.println(name);
		
		int size =name.size();
		System.out.println(size);
		
		Object[] al= name.toArray();
		System.out.println("take index value:"+al[2]);
		for (int i = 0; i < al.length; i++) {
			System.out.println(al[i]);
			
		}
	}

}
