package FourthDay_Polymorphism;

public class ParameterDemo {

	public static void main(String[] args) {
		
		ParameterDemo demo = new ParameterDemo();
		demo.add(10, 20);
		demo.addDouble(10.45, 6, 9.67);
		demo.myName("Selenium", "World");
	}
	
	
	public void add(int a, int b) {
		
		int c = a+b;
		
		System.out.println("Sum of a + b = "+ c);
		
	}
	
	public void addDouble(double a, int b, double d) {
		
		double c = a+b-d;
		
		System.out.println("Sum of a + b - d = "+ c);
		
	}
	
	public void myName(String fristName, String LastName) {
		
		String fullName = fristName+LastName;
		
		System.out.println("My fullName  = "+ fullName);
		
	}
	

}
