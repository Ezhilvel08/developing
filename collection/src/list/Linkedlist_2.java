package list;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist_2 {

	public static void main(String[] args) {
		List<Object> name = new LinkedList<Object>();
		name.add(88);
		name.add(2.98);
		name.add("murali");
		name.add("raj");
		name.add(73536637);
		name.add("lakshmi");
		name.add("murali");
		name.add("raj");
		name.add("F");
		name.add(true);
		
		Object index = name.get(4);
		System.out.println("name :"+index);
		
		boolean contain  = name.contains("murali");
		System.out.println(contain);
		
		int size=name.size();
		System.out.println("size of array"+size);
		System.out.println("string :"+name);
		
		for(int i=0;i<name.size();i++) {
		Object names =name.get(i);
		System.out.println("namelist:"+ names);
		}
	
		
	}
	}


