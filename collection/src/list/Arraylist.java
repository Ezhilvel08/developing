package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		

		List<String> carslist = new LinkedList<String>();
		carslist.add("TATA");
		carslist.add("maruthi");
		carslist.add("mahindra");
		carslist.add("jaguar");
		
		/*
		 * list follow insertion order so use for loop for to change string to array
		 */
		for(int i=0;i<carslist.size();i++) {
		String cars = carslist.get(i);
		System.out.println("no.0:" + cars);
		}
		boolean ne = carslist.add("jeep");
		System.out.println(ne);
		
		System.out.println(carslist);
		
		System.out.println("no.1:" + carslist.get(3));
		
		
		System.out.println(carslist.set(2, "nano"));
		
		carslist.add("rollsroyces");
		System.out.println("no.2:" + carslist);
		
		System.out.println("no.3:" + carslist.indexOf("jaguar"));
		
		carslist.set(4,"bmw");
		System.out.println("no.4:" + carslist);
		
		carslist.add(5,"rollsroyces");;
		System.out.println("no.4.1:" + carslist);
		
		carslist.remove(2);
		System.out.println("no.5:" + carslist);

		System.out.println("no.6:" + carslist.isEmpty());
		carslist.set(0, "nissan");
	
		System.out.println("no.7:" + carslist);

		ArrayList<String> anothercar = new ArrayList<String>();
		anothercar.addAll(carslist);
		System.out.println("no .8:" + anothercar);

		anothercar.clear();
		System.out.println("no.9:" + anothercar);

		// iteration for each

		for (String car : carslist) {
			System.out.println("n0.10:" + car);
		}
		System.out.println("-----------------------------------------------");
		//for loop
		for (int i = 0; i < carslist.size(); i++) {
			System.out.println("no.11:" + carslist.get(i));

		}
		
	}

}
