package ninthDay_SuperDemo;

public class childClass extends ParentClass{

	
	int int_rate = 10;
	
	
	public static void main(String[] args) {
		childClass childClass = new childClass();
		
		//childClass.privateBankIntrestRate();
		childClass.bankIntrestRate();
		
		
	}
	
	public void bankIntrestRate() {
		
		super.bankIntrestRate("HDFC");
		
		System.out.println("My bank intrest rate " + super.int_rate);
		
	}
	
	
	public void privateBankIntrestRate() {
		System.out.println("My bank intrest rate : " + super.int_rate);
		
	}

}
