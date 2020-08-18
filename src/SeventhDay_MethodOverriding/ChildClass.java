package SeventhDay_MethodOverriding;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
//		ChildClass childClass = new ChildClass();
//		childClass.displayName();
		
		ParentClass parentClass = new ChildClass();
		parentClass.displayName("Sai");
		
	}
	
	public void lastNams() {
	
		System.out.println("My Child class LastName ");
	}
	
	
	public void displayName(String name) {
		System.out.println("My child class display name is : " + name);
	}

}
