package list;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class List_to_set {

	public static void main(String[] args) {
		List<Object> name = new LinkedList<Object>();
		name.add(88);
		name.add(2.98);
		name.add("ravi");
		name.add("vinoth");
		name.add(73536637);
		name.add("lakshmi");
		name.add("ravi");
		name.add("vinoth");
		name.add("F");
		name.add(true);
		
		System.out.println("in list"+name);
		
		LinkedHashSet<Object> rm= new LinkedHashSet<Object>(name);
		System.out.println("remove duplicate in list:"+rm);



	}

}
