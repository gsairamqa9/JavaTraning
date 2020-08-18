package TenthDayDemo;

public class ThisKeywordDemo {

	
	public ThisKeywordDemo() {
			
		this(10);
		System.out.println("this is default constructor");
	}
	
	public ThisKeywordDemo(String name) {
		
		System.out.println("this is parameterized string constructor : " + name);
	}
	
	public ThisKeywordDemo(int number) {
		
		this("Selenium");
		System.out.println("this is parameterized integer constructor : "+ number);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ThisKeywordDemo demo = new ThisKeywordDemo();
		
	}

}
