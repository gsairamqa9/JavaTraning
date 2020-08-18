package ThirdDay_Strings;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s = "Selenium 1- Q TP ";
		
		 System.out.println(s.replace("s", "a"));
		
		for (int i = 0; i < s.length(); i++) {
			
			int Ascii = s.charAt(i)+1;
			
			char d = (char) Ascii;
					
			//System.out.println(d);
			
			
		}
		 
	}

}
