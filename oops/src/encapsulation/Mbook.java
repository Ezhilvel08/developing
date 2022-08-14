package encapsulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book>myBook =new HashMap<Integer,Book>();
		Book b1 =new Book(1,"block Book","xyz","ABC",14);
		Book b2 =new Book(2,"Complete Java","ABC","xyz",20);
		Book b3 =new Book(3,"C Language","Turbo","ABC",30);
		
		myBook.put(1, b1);
		myBook.put(2, b2);
		myBook.put(3, b3);
		
		for(Entry<Integer, Book> entry:myBook.entrySet()) {
		int key = entry.getKey();
		Book b = entry.getValue();
		System.out.println(key+" Details");
		System.out.println("ID : "+b.id +"Name :"+b.name +"Author :"+b.author +"Pub :"+b.pub + "Quantity:"+ b.quantity);
		}
	}

}
