package SixthDay;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		ConstructorDemo demo = new ConstructorDemo(50,"Sai");
		
		
	}
	
	
	public ConstructorDemo() {
		
		System.out.println("Constructor is invoked");
	}
	
	public ConstructorDemo(int marks) {
		
		System.out.println("Constructor is invoked Marks are "+ marks);
	}

	public ConstructorDemo(String name) {
	
	System.out.println("Constructor is invoked name is "+ name);
	}

	public ConstructorDemo(int marks, String name) {
	
	System.out.println("Constructor is invoked name and marks are " + marks+ " " + name);
	}

	public ConstructorDemo(String name, int marks) {
	
	System.out.println("Constructor is invoked");
	}
	
	
}
