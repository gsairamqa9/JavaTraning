package ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		
		obj.add(11.23);
		
		obj.add("Selenium");
		
		obj.add(99876523);
		
		obj.add("Java");
		
		 int size = obj.size();
		 
		for (int i = 0; i < size; i++) {
			System.out.println("values in array list are for loop : " +obj.get(i));
		}
		
		
		for (Object object : obj) {
			System.out.println("values in array list are for each loop : "+ object);
		}
		
		
		
		Iterator itr = obj.iterator();
		
		while (itr.hasNext()) {
			Object value = itr.next();
			System.out.println("values in array list are Iterator : " + value);
		}
		
		
		
		System.out.println(obj.get(0));
		

	}

}
