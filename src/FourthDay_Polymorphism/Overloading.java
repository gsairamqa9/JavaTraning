package FourthDay_Polymorphism;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading overloading = new Overloading();
		overloading.add();
		overloading.add(10,10.2);
		overloading.add(10, 10);
		
	}
	
	public void add() {
		int c = 10+20;
	}
	
	public void add(int a, double b) {
	 int c = a+10;	
	}


	public void add(int a, int b) {
	
	int c = a+b;
	}
	
	
	

}
