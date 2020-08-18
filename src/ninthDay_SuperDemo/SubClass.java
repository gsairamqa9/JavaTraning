package ninthDay_SuperDemo;

public class SubClass extends BaseClass{

	
	public SubClass() {
		
		super();
		//super("Sai"); 
		System.out.println("Constructor in sub-class");
	}
	
	public SubClass(String name) {
		
		//super();
		super("Sai"); 
		System.out.println("Constructor in sub-class");
	}
	
	public static void main(String[] args) {
		SubClass subClass = new SubClass();

	}

}
