package InheritanceDemo;

public class ChildClass  extends BaseClass{

	public static void main(String[] args) {

		ChildClass childClass = new ChildClass();
		
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
