package map;

import java.util.HashMap;
import java.util.Map;

public class Treemap {

	public static void main(String[] args) {

		Map<Integer,String> na_list = new HashMap<Integer,String>();
		na_list.put(1, "jerald");
		na_list.put(2, "ravi");
		na_list.put(3, "ramesh");
		na_list.put(4, "kuppuraj");
		na_list.put(5, "vimal");
		na_list.put(6, "raj");
		
		
        
		
		boolean cont_key = na_list.containsKey(2);
		System.out.println("contain key 2:"+cont_key);
		
		boolean cont_val = na_list.containsValue("ramesh");
		System.out.println("contain key 2:"+cont_val);
		
		// Displaying the Map
        System.out.println("Initial Mappings are: " + na_list);
  
        // Using entrySet() to get the set view
        System.out.println("The set is: " + na_list.entrySet());
        
        System.out.println("The Value is: " + na_list.get(3));
        
        System.out.println("set of key:"+na_list.keySet());
        
        System.out.println("map is empty:"+ na_list.isEmpty());
        
      
     
      
		
	}

}
