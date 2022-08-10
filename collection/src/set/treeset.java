package set;

import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		Set<String> name = new TreeSet<String>();
		name.add("ezhilvel");
		name.add("ramu");
		name.add("murali");
		name.add("vimalraj");
		name.add("kuppuraj");
		name.add("jayalakshmi");
		name.add("murali");
		name.add("vimalraj");
		name.add("arun");
		name.add("saravanan");
		
		boolean present=name.containsAll(name);
		System.out.println("all name are present:"+ present);
		
		Set<String> name1 = new TreeSet<String>();
		name1.add("palyer");
		name1.add("music");
		
		name1.addAll(name);
		System.out.println("addall :"+name1);
		
		boolean empty=name.isEmpty();
		System.out.println("list is empty:"+empty);
		
		for (String namelist : name) {
			System.out.println("set : " + namelist);
		}

	}

}
