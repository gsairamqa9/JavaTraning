package OverRiding;

public class HDFC extends RBI implements Loans{

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.homeLoanIntrest();
	}
	
	
	public void homeLoanIntrest() {
		
		System.out.println("Home loan Intrest is 8.50%");
	}


	@Override
	public void homeLoan() {
		
		
	}


	@Override
	public void carLoan() {
		
		
	}

}
