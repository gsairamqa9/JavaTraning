package ElventhDay_WrapperDemo;

public class BoxandUnBox {

	public static void main(String[] args) {
		
		
		Integer  i = new Integer(10);
		
		int i1= i;
		
		System.out.println("Int value : "+ i1);
		
		Integer  i2 = new Integer(1000);
		
		 String i3= String.valueOf(i2);
		
		System.out.println("String value : "+ i3);

		
			int  s = 900;
		
		Integer s1 = new Integer(s);
		
		System.out.println("Integer value : "+ s1);
		
		String s2 = new String("123");
		
		 int s3= Integer.valueOf(s2);
		
		System.out.println("Int value : "+ s3);
		
		
	}

}
