package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		Set<String> name = new LinkedHashSet<String>();
		name.add("vel");
		name.add("ragu");
		name.add("murali");
		name.add("vimalraj");
		name.add("saravanan");
		
		System.out.println("set of name:"+name);
		
		Set<String> name1 = new LinkedHashSet<String>();
		name1.add("kuppusami");
		name1.add("lakshmi");
		name1.add("murali");
		name1.add("vimalraj");
		name1.add("arun");
		System.out.println("set of name1:"+name1);
		
		 name.retainAll(name1);
		System.out.println("set of retainall name:"+name);
		
		
		
	
		 
		
		 
	}

}
