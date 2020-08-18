package FifthDay_Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int student_marks[] = new int[6];
		
		student_marks[0] = (int) 98.89;
		student_marks[1]= 89;
		student_marks[2] = 56;
		student_marks[3]= 78;
		student_marks[4] = 80;
		student_marks[5]= 86;
		
		
		
		//datatype is fixed
		//user should know the exact index value to retrive data
		
		//System.out.println("student marks :"+ student_marks[6]);
		
		System.out.println(student_marks.length);
		
		for (int i = 0; i < student_marks.length; i++) {
			System.out.println("student marks :"+ student_marks[i]);
		}
		
		
	}

}
