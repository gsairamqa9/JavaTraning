package OverRiding;

public class SBI extends RBI{

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.homeLoanIntrest(10);

	}
	
	public void homeLoanIntrest(int percentage) {
		
		System.out.println("Home loan Intrest is 9%");
	}

}
