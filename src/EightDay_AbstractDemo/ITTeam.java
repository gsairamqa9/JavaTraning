package EightDay_AbstractDemo;

public abstract class ITTeam  implements Employee{

	
	public void goodies() {
		System.out.println("My goodies are laptop,Waterbottle");
		
	}

	
	public void workForce() {
		System.out.println("My workForce is laptop");
		
	}

	
	public abstract void salary();

}
