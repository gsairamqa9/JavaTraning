package SetDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
		obj.add("Selenium");
		
		obj.add("qwerty123");
		
		obj.add("100");
		
		obj.add("Sai");
		
		obj.add("qwerty");
		
		
		//System.out.println(obj.ge);
		
		ArrayList<String> obj1 = new ArrayList<String>(obj);
		
		System.out.println(obj1.get(0));
		
	}

}
