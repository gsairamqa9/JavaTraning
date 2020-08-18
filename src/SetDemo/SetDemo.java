package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> obj = new HashSet<String>();
		
		obj.add("Selenium");
		
		obj.add("QTP");
		
		obj.add("100");
		
		obj.add("qwerty");
		
		obj.add("qwerty");
		
		obj.add("qwerty");
		
		
		
		
		System.out.println(obj);
		
		
		
//		for (String data : obj) {
//			System.out.println(data);
//		
//		}
		
		
//		Iterator<String> itr = obj.iterator();
//		
//		while (itr.hasNext()) {
//			Object value = itr.next();
//			System.out.println("values in Set are Iterator : " + value);
//		}
		
	
	
	ArrayList<String> arrayList = new ArrayList<String>(obj);
	
	
	System.out.println(arrayList.get(4));
	
	
	}
	
	
	

}
