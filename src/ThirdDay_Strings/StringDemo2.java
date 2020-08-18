package ThirdDay_Strings;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s = "Selenium 1- Q TP ";
		
		
		  String[] split = s.split("-");
		  
		  for (int i = 0; i < split.length; i++) {
			
			  System.out.println("split value "+ i + " is : " + split[i].trim());
			  
			  if (split[i].trim().equals("Q TP")) {
				System.out.println("Test is passsed");
				break;
				
			}
		}
		  
		
		

	}

}
