package InheritanceDemo;

public class ChildClass2  extends BaseClass{

	public static void main(String[] args) {

		ChildClass2 childClass = new ChildClass2();
		
		//BaseClass childClass = new BaseClass();
		
		//BaseClass childClass = new ChildClass2();
		
		//ChildClass2 childClass = new BaseClass();
		
		childClass.add(10, 10);
		childClass.sub(10, 10);
		childClass.mul(10, 10);
		childClass.div(10, 10);
		
	}
	
	
	public void mul(int a , int b) {
		
		int c= a*b;
		System.out.println("Performing Mul method in Base class"+ c);
	}
	
	
	public void div(int a , int b) {
		
		int c= a/b;
		System.out.println("Performing div method in Base class"+ c);
	}

}
