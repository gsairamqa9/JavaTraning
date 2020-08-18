package TenthDayDemo;

public class ThisVariableDemo {

	int x = 20;
	int y =30;
	
	
	
	public void add(int x, int y) {
		
		x=this.x;
		y=this.y;
		
		sum();
	}
	
	public void sum() {
		int z = x+y;
		
		System.out.println("sum is : "+ z);
	}
	
	public static void main(String[] args) {
		
		ThisVariableDemo demo = new ThisVariableDemo();
		
		demo.add(10, 50);
	}

}
