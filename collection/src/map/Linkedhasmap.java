package map;

import java.util.HashMap;
import java.util.Map;

public class Linkedhasmap {

	public static void main(String[] args) {
		Map<Integer, String> namelist = new HashMap<Integer, String>();
		namelist.put(1, "vel");
		namelist.put(2, "murali");
		namelist.put(3, "ramesh");
		namelist.put(4, "kuppuraj");
		namelist.put(5, "vimal");
		namelist.put(4, "kuppuraj");

		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(6, "vijay");
		mp.put(7, "kamal");
		mp.put(8, "rajini");

		namelist.put(9, "surya");
		System.out.println("put one new value:" + namelist);

		namelist.putAll(mp);
		System.out.println("put all element:" + namelist);

		namelist.remove(10);
		System.out.println(namelist);

		int size = namelist.size();
		System.out.println("size of namelist is :" + size);
		
		namelist.clear();
		System.out.println(namelist);

	}

}
