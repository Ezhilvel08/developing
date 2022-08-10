package map;

import java.util.HashMap;
import java.util.Map;

public class Cmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> automobile = new HashMap<Integer,String>();
		automobile.put(1, "tata");
		automobile.put(2, "mahindra");
		automobile.put(3, "jaguar");
		automobile.put(4, "audi");
		automobile.put(5, "bently");
		automobile.put(6, "skoda");
		
		// to get value for key
		System.out.println(automobile.get(2));
		// to create duplicate
		HashMap<Integer,String> automobile2 = new HashMap<Integer,String>();
		automobile2.putAll(automobile);
		System.out.println(automobile2);
		// to clear all the value
		automobile2.clear();
		System.out.println(automobile2);
		// to check the map is empty
		boolean check = automobile2.isEmpty();
		System.out.println(check);
		// to copy the map
		automobile.clone();
		System.out.println(automobile);
		
		System.out.println(automobile.toString());
		// sperate forloop for map is formap
		for (Map.Entry<Integer, String> entry :automobile .entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}

}
