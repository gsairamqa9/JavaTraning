package SixthDay;

public class MarksConstructor {

	
	int Science = 98;
	int maths = 90;
	int results;
	public static void main(String[] args) {

		MarksConstructor obj = new MarksConstructor();
		obj.total();
		
	}
	
	public MarksConstructor() {
		 results = Science+maths;
	}

	public void total() {
		System.out.println("My total marks are : "+ results);
	}
}
