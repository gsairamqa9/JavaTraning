package EightDay_AbstractDemo;

public class HRTeam extends ITTeam {

	public static void main(String[] args) {
		HRTeam hr = new HRTeam();
		hr.goodies();
		hr.workForce();
		hr.salary();
		
		
		ITTeam itTeam = new HRTeam();
		
		itTeam.goodies();
		itTeam.workForce();
		itTeam.salary();
		
//		Employee employee = new Employee();
//		employee.goodies();
//		employee.salary();
		
		

	}

	
	public void salary() {
	
		System.out.println("My Salary is 10LPA");
	}
	
	public void bonus() {
		System.out.println("My bonus is 1LPA");
	}
	
	

}
