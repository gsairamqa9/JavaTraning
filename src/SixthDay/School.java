package SixthDay;

public class School implements Students,Students2{

	
	public static void main(String[] args) {
		
		
		//Java will not able
		School obj = new School();
		
		obj.marks();
		obj.name();
		obj.rollnumber();
		obj.grade();
		
	}
	
	public void rollnumber() {
		System.out.println("My rollnumber");
	}
	
	public void grade() {
		System.out.println("My Grade");
		
	}

	@Override
	public void name1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		
	}
	
	

}
