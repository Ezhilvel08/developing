package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

		Map<Integer,String> namelist = new HashMap<Integer,String>();
		namelist.put(1, "ezhil");
		namelist.put(2, "murugan");
		namelist.put(3, "ramesh");
		namelist.put(4, "kuppuraj");
		namelist.put(5, "vimal");
		namelist.put(4, "kuppuraj");
		
	for (Map.Entry<Integer, String> entry : namelist.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		
		System.out.println(key+" "+val);
	}

	
	}

}
