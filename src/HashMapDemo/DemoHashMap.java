package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sai");
		map.put(2,"Sravanthi");
		//map.put(null, "xyz");
		map.put(null, null);
		
		//System.out.println(map);
		
		//System.out.println(map.get(2));
		
		//System.out.println(map.get(4));
		
		
		
//		for (Map.Entry<Integer, String> data : map.entrySet()) {
//			System.out.println("values are "+ data.getKey() + " "+ data.getValue());
//		}
		
		Map<Set<Integer>, ArrayList<String>> m = new HashMap<Set<Integer>, ArrayList<String>>();

		Set<Integer> s = new HashSet<Integer>();
		
		s.add(1);
		s.add(2);
		
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("s");
		l.add("a");
		
		
		m.put(s, l);
		//System.out.println(m);
		
		for (Entry<Set<Integer>, ArrayList<String>> data : m.entrySet()) {
			
			 int size = data.getKey().size();
			for (Integer as : s) {
				System.out.println(as);
			}
			 
			
			System.out.println("values are "+ data.getKey() + " "+ data.getValue());
		}
		
		
	}

}
