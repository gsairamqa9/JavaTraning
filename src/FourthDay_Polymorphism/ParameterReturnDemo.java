package FourthDay_Polymorphism;

public class ParameterReturnDemo {

	public static void main(String[] args) {
		
		ParameterReturnDemo demo = new ParameterReturnDemo();
		 int sum= demo.add(10, 20);
		 System.out.println("return value of a+b "+ sum);
		
	}
	
	
	public int add(int a, int b) {
		
		int c = a+b;
		int i = 0;
		
		for (int j = 0; j < c; j++) {
			
			i  = condition(j);
			
		}
		
		System.out.println(i);
		return i;
		
		
		
	}
	
	
	public int condition(int j) {
		if (j == 10) {
			return j;
		}
		return j;
	}
	
	public double addDouble(double a, int b, double d) {
		
		double c = a+b-d;
		
		System.out.println("Sum of a + b - d = "+ c);
		
		return c;
		
	}
	
	public String myName(String fristName, String LastName) {
		
		String fullName = fristName+LastName;
		
		System.out.println("My fullName  = "+ fullName);
		
		return fullName;
	}
	

}
