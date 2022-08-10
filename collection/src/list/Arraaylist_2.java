package list;

import java.util.ArrayList;
import java.util.List;

public class Arraaylist_2{
	public static void main(String[] args) {
		

		List<Object> name = new ArrayList<Object>();
		name.add("ezhilvel");
		name.add(10);
		name.add("mura");
		name.add("raj");
		name.add(987654321);
		name.add("lakshmi");
		name.add("mura");
		name.add("raj");
		name.add("A");
		name.add("saravanan");
		
		Object index = name.get(4);
		System.out.println("name :"+index);
		
		System.out.println(name);
		
		//for loop
		for(int i=0;i<name.size();i++) {
		Object names =name.get(i);
		System.out.println("namelist:"+ names);
		}
	
		Object rmname = name.remove(7);
		System.out.println("name:"+rmname);
		
	
		
	}

}
