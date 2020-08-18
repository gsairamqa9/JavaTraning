package FristDay1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> obj= new HashMap<String, String>();
		
		obj.put("100", "Selenium");
		
		for (Map.Entry data : obj.entrySet()) {
			System.out.println(data.getKey()+ " "+ data.getValue());
		}

	}

}
