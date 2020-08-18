package FristDay1;

import FristDay.Class1;

public class Class11 {
	
	
	
	static Class1 class1;

	
	 static {
		 class1 = new Class1();
		
	}
	
	public static void main(String[] args) {
		
		staticMethod();
	}
	
	
	public static void staticMethod() {
		System.out.println("calling static method");
		class1.nonStaticMethod();
	}
	
}
