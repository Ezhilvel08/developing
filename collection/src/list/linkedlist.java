package list;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		
		List<String> name = new LinkedList<String>();
		name.add("ezhilvel");
		name.add("ragu");
		name.add("murali");
		name.add("vimalraj");
		name.add("kuppuraj");
		name.add("jayalakshmi");
		name.add("murali");
		name.add("vimalraj");
		name.add("arun");
		name.add("saravanan");
		
		String index = name.get(4);
		System.out.println("name :"+index);
		
		boolean contain  = name.contains("murali");
		System.out.println(contain);
		
		int size=name.size();
		System.out.println("size of array"+size);
		System.out.println("string :"+name);
		
		for(int i=0;i<name.size();i++) {
		String names =name.get(i);
		System.out.println("namelist:"+ names);
		}
	
		
	}

}
